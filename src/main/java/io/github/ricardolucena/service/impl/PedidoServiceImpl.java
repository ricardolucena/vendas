package io.github.ricardolucena.service.impl;

import io.github.ricardolucena.domain.repository.Pedidos;
import io.github.ricardolucena.service.PedidoService;
import org.springframework.stereotype.Service;

@Service
public class PedidoServiceImpl implements PedidoService {

    private Pedidos repository;

    public PedidoServiceImpl(Pedidos repository) {
        this.repository = repository;
    }
}
