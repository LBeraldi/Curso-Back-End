package io.github.lberaldi.vendasbd;

import io.github.lberaldi.vendasbd.domain.entity.Cliente;
import io.github.lberaldi.vendasbd.domain.repository.Clientes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class VendasBdApplication {

	@Bean
	public CommandLineRunner init(@Autowired Clientes clientes){
		return args -> {
			System.out.println("Salvando clientes");
			clientes.salvar(new Cliente("Lucas"));
			clientes.salvar(new Cliente("Jo nata"));

			System.out.println("Listando clientes");
			List<Cliente> todosCliente = clientes.obterTodos();
			todosCliente.forEach(System.out::println);

			System.out.println("Atualizando clientes");
			todosCliente.forEach(c -> {
				c.setNome(c.getNome() + " Atualizado");
				clientes.atualizar(c);
			});

			System.out.println("Listando clientes Atualizados");
			todosCliente = clientes.obterTodos();
			todosCliente.forEach(System.out::println);

			System.out.println("Pesquisando clientes por nome");
			clientes.buscarPorNome("Lu").forEach(System.out::println);

			System.out.println("Deletando clientes");
			clientes.obterTodos().forEach(cliente -> {
			clientes.deletar(cliente);
			});

			todosCliente = clientes.obterTodos();
			if (todosCliente.isEmpty()){
				System.out.println("Nenhum cliente na lista");
			}else{
				todosCliente.forEach(System.out::println);
			}

		};
	}

	public static void main(String[] args) {
		SpringApplication.run(VendasBdApplication.class, args);
	}

}
