package io.github.lberaldi.domain.repository;

import io.github.lberaldi.domain.entity.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Produtos extends JpaRepository<Produto,Integer> {
}
