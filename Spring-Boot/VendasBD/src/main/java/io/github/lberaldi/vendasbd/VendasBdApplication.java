package io.github.lberaldi.vendasbd;

import io.github.lberaldi.vendasbd.domain.entity.Cliente;
import io.github.lberaldi.vendasbd.domain.entity.Pedido;
import io.github.lberaldi.vendasbd.domain.repository.Clientes;
import io.github.lberaldi.vendasbd.domain.repository.Clientes01;
import io.github.lberaldi.vendasbd.domain.repository.Pedidos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@SpringBootApplication
public class VendasBdApplication {

	@Bean
	public CommandLineRunner init(@Autowired Clientes clientes,
								  @Autowired Pedidos pedidos){
		return args -> {
			System.out.println("Salvando clientes");
			Cliente lucas = new Cliente("Lucas");
			clientes.save(lucas);

			Pedido p = new Pedido();
			p.setCliente(lucas);
			p.setDataPedido(LocalDate.now() );
			p.setTotal(BigDecimal.valueOf(10));

			pedidos.save(p);

//			Cliente cliente = clientes.findClienteFetchPedidos(lucas.getId());
//			System.out.println(cliente);
//			System.out.println(cliente.getPedidos());

			pedidos.findByCliente(lucas).forEach(System.out::println);
		};
	}

	public static void main(String[] args) {
		SpringApplication.run(VendasBdApplication.class, args);
	}

}
