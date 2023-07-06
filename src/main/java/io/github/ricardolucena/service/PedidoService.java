package io.github.ricardolucena.service;

import io.github.ricardolucena.domain.entity.Pedido;
import io.github.ricardolucena.rest.dto.PedidoDTO;

public interface PedidoService {
    Pedido salvar(PedidoDTO dto);
}
