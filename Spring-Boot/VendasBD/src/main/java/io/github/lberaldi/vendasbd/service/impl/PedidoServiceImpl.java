package io.github.lberaldi.vendasbd.service.impl;

import io.github.lberaldi.vendasbd.domain.repository.Pedidos;
import io.github.lberaldi.vendasbd.service.PedidoService;
import org.springframework.stereotype.Service;

@Service
public class PedidoServiceImpl implements PedidoService {

    private Pedidos repository;

    public PedidoServiceImpl(Pedidos repository) {
        this.repository = repository;
    }
}
