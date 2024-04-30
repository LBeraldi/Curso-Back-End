package io.github.lberaldi.vendasBD;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;

@Development
public class MinhaConfiguration {

    @Bean
    public CommandLineRunner executar(){
      return args -> {
          System.out.println("RODANDO APLICAÇÃO DE DESENVOLVIMENTO");
      };
    }
}
