package io.github.lberaldi.apirestfull.domain.repository;
import io.github.lberaldi.apirestfull.domain.entity.Cliente;
import io.github.lberaldi.apirestfull.domain.entity.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface Pedidos extends JpaRepository<Pedido, Integer> {
    List<Pedido> findByCliente( Cliente cliente );
}
