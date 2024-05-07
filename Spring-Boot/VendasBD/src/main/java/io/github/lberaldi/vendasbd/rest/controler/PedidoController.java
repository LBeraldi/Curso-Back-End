package io.github.lberaldi.vendasbd.rest.controler;


import io.github.lberaldi.vendasbd.domain.entity.ItemPedido;
import io.github.lberaldi.vendasbd.domain.entity.Pedido;
import io.github.lberaldi.vendasbd.domain.enums.StatusPedido;
import io.github.lberaldi.vendasbd.rest.dto.AtualizacaoStatusPedidoDTO;
import io.github.lberaldi.vendasbd.rest.dto.InformacaoItemPedidoDTO;
import io.github.lberaldi.vendasbd.rest.dto.InformacoesPedidoDTO;
import io.github.lberaldi.vendasbd.rest.dto.PedidoDTO;
import io.github.lberaldi.vendasbd.service.PedidoService;
import jdk.jshell.Snippet;
import org.springframework.http.HttpStatus;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.time.format.DateTimeFormatter;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/pedidos")
public class PedidoController {

    private PedidoService service;

    public PedidoController(PedidoService service) {
        this.service = service;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Integer save(@RequestBody PedidoDTO dto){
        Pedido pedido = service.salvar(dto);
        return pedido.getId();
    }

    @GetMapping("{id}")
    public InformacoesPedidoDTO getById(@PathVariable Integer id) {
        return service.obterPedidoCompleto(id)
                .map(p -> converter(p))
                .orElseThrow(()-> new ResponseStatusException(HttpStatus.NOT_FOUND, "Pedido não encontrado."));
    }

    private InformacoesPedidoDTO converter(Pedido pedido) {
        return InformacoesPedidoDTO.builder().codigo(pedido.getId())
                .dataPedido(pedido.getDataPedido().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")))
                .cpf(pedido.getCliente().getCpf())
                .nomeCliente(pedido.getCliente().getNome())
                .total(pedido.getTotal())
                .status(pedido.getStatus().name())
                .itens(converter(pedido.getItens()))
                .build();

    }

    @PatchMapping("{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void updateStatus(@PathVariable Integer id, @RequestBody AtualizacaoStatusPedidoDTO dto){
        String novoStatus = dto.getNovoStatus();
        service.atualizaStatus(id, StatusPedido.valueOf(novoStatus));
    }

    private List<InformacaoItemPedidoDTO> converter(List<ItemPedido> itens){
        if (CollectionUtils.isEmpty(itens)){
            return Collections.emptyList();
        }

        return itens.stream().map(
                item -> InformacaoItemPedidoDTO
                        .builder().descricaoProduto(item.getProduto().getDescricao())
                        .pecoUnitario(item.getProduto().getPreco())
                        .quantidade(item.getQuantidade())
                        .build()

        ).collect(Collectors.toList());
    }

}
