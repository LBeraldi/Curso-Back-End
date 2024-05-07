package io.github.lberaldi.vendasbd.service.impl;

import io.github.lberaldi.vendasbd.exception.PedidoNaoEncontradoException;
import io.github.lberaldi.vendasbd.domain.entity.Cliente;
import io.github.lberaldi.vendasbd.domain.entity.ItemPedido;
import io.github.lberaldi.vendasbd.domain.entity.Pedido;
import io.github.lberaldi.vendasbd.domain.entity.Produto;
import io.github.lberaldi.vendasbd.domain.enums.StatusPedido;
import io.github.lberaldi.vendasbd.domain.repository.Clientes;
import io.github.lberaldi.vendasbd.domain.repository.ItensPedido;
import io.github.lberaldi.vendasbd.domain.repository.Pedidos;
import io.github.lberaldi.vendasbd.domain.repository.Produtos;
import io.github.lberaldi.vendasbd.exception.RegraNegocioException;
import io.github.lberaldi.vendasbd.rest.dto.ItemPedidoDTO;
import io.github.lberaldi.vendasbd.rest.dto.PedidoDTO;
import io.github.lberaldi.vendasbd.service.PedidoService;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class PedidoServiceImpl implements PedidoService {

    private final Pedidos repository;
    private final Clientes clientesRepository;
    private final Produtos produtosRepository;
    private final ItensPedido itensPedidoRepository;

    @Override
    @Transactional
    public Pedido salvar(PedidoDTO dto) {
        Integer idCliente = dto.getCliente();
        Cliente cliente = clientesRepository
                .findById(idCliente)
                .orElseThrow(() -> new RegraNegocioException("Código do cliente Inválido"));

        Pedido pedido = new Pedido();
        pedido.setTotal(dto.getTotal());
        pedido.setDataPedido(LocalDate.now());
        pedido.setCliente(cliente);
        pedido.setStatus(StatusPedido.REALIZADO);

        List<ItemPedido> itensPedido = converterItem(pedido, dto.getItens());
        repository.save(pedido);
        itensPedidoRepository.saveAll(itensPedido);
        pedido.setItens(itensPedido);
        return pedido;
    }

    @Override
    public Optional<Pedido> obterPedidoCompleto(Integer id) {
        return repository.findByIdFetchItens(id);
    }

    @Override
    @Transactional
    public void atualizaStatus(Integer id, StatusPedido statusPedido) {
        repository.findById(id)
                .map(pedido -> {
                    pedido.setStatus(statusPedido);
                    return repository.save(pedido);
                }).orElseThrow(() -> new PedidoNaoEncontradoException());
    }

    private List<ItemPedido> converterItem(Pedido pedido, List<ItemPedidoDTO> itens){
        if (itens.isEmpty()){
            throw new RegraNegocioException("Não é possivel realizar um pedido sem item.");
        }

        return itens.stream().map(dto -> {
            Integer idProduto = dto.getProduto();
            Produto produto = produtosRepository.findById(idProduto)
                    .orElseThrow(() -> new RegraNegocioException("Código do produto Inválido " + idProduto));

            ItemPedido itemPedido = new ItemPedido();
            itemPedido.setQuantidade(dto.getQuantidade());
            itemPedido.setPedido(pedido);
            itemPedido.setProduto(produto);
            return itemPedido;
        }).collect(Collectors.toList());
    }
}
