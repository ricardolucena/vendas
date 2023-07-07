package io.github.ricardolucena.service;

import io.github.ricardolucena.domain.entity.Pedido;
import io.github.ricardolucena.domain.enums.StatusPedido;
import io.github.ricardolucena.rest.dto.PedidoDTO;

import java.util.Optional;

public interface PedidoService {
    Pedido salvar(PedidoDTO dto);
    Optional<Pedido> obterPedidoCompleto(Integer id);
    void atualizaStatus(Integer id, StatusPedido statusPedido);
}
