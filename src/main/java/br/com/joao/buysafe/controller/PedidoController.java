package br.com.joao.buysafe.controller;

import br.com.joao.buysafe.model.Pedido;
import br.com.joao.buysafe.service.PedidoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pedido")
public class PedidoController {

    private final PedidoService pedidoService;

    public PedidoController(PedidoService pedidoService) {
        this.pedidoService = pedidoService;
    }

    @PostMapping
    public ResponseEntity<Pedido> salvar(@RequestBody Pedido pedido){
        var pedidoSalvo = pedidoService.salvar(pedido);
        return ResponseEntity.ok().body(pedidoSalvo);
    }

}
