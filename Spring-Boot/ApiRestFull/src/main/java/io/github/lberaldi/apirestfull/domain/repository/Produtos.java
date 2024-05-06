package io.github.lberaldi.apirestfull.domain.repository;
import io.github.lberaldi.apirestfull.domain.entity.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Produtos extends JpaRepository<Produto, Integer> {
}
