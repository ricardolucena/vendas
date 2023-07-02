package io.github.ricardolucena.domain.repository;

import io.github.ricardolucena.domain.entity.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Produtos extends JpaRepository<Produto, Integer> {
}
