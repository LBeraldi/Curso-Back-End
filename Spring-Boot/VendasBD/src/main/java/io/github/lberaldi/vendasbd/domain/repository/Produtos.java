package io.github.lberaldi.vendasbd.domain.repository;

import io.github.lberaldi.vendasbd.domain.entity.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Produtos extends JpaRepository<Produto, Integer> {
}
