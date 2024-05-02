package io.github.lberaldi.vendasbd.domain.repository;

import io.github.lberaldi.vendasbd.domain.entity.ItemPedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItensPedido extends JpaRepository<ItemPedido, Integer> {
}
