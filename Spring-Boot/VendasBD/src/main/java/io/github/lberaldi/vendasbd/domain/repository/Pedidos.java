package io.github.lberaldi.vendasbd.domain.repository;

import io.github.lberaldi.vendasbd.domain.entity.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Pedidos extends JpaRepository<Pedido, Integer> {
}
