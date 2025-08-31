package br.com.joao.buysafe.repository;

import br.com.joao.buysafe.model.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidoRepository extends JpaRepository<Pedido, Long> {
}
