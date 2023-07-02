package io.github.ricardolucena.domain.repository;

import io.github.ricardolucena.domain.entity.Cliente;
import io.github.ricardolucena.domain.entity.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface Pedidos extends JpaRepository<Pedido, Integer> {
    List<Pedido> findByCliente(Cliente cliente);
}
