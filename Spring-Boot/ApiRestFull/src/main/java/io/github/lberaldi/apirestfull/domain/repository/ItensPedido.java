package io.github.lberaldi.apirestfull.domain.repository;
import io.github.lberaldi.apirestfull.domain.entity.ItemPedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItensPedido extends JpaRepository<ItemPedido, Integer> {
}
