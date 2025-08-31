package br.com.joao.buysafe.service;

import br.com.joao.buysafe.model.Pedido;
import br.com.joao.buysafe.repository.PedidoRepository;
import org.springframework.stereotype.Service;

@Service
public class PedidoService {

    private final PedidoRepository pedidoRepository;

    public PedidoService(PedidoRepository pedidoRepository) {
        this.pedidoRepository = pedidoRepository;
    }

    public Pedido salvar(Pedido pedido){
        return pedidoRepository.save(pedido);
    }
}
