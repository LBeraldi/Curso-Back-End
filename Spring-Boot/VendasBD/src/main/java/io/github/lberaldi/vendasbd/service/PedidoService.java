package io.github.lberaldi.vendasbd.service;

import io.github.lberaldi.vendasbd.domain.entity.Pedido;
import io.github.lberaldi.vendasbd.domain.enums.StatusPedido;
import io.github.lberaldi.vendasbd.rest.dto.PedidoDTO;

import java.util.Optional;

public interface PedidoService {
    Pedido salvar(PedidoDTO dto);

    Optional<Pedido> obterPedidoCompleto(Integer id);
    void atualizaStatus(Integer id, StatusPedido statusPedido);
}
