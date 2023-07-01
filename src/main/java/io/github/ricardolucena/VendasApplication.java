package io.github.ricardolucena;

import io.github.ricardolucena.domain.entity.Cliente;
import io.github.ricardolucena.domain.repositorio.Clientes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class VendasApplication {

    @Bean
    public CommandLineRunner init(@Autowired Clientes clientes){
        return args -> {
            System.out.println("Salvando clientes");
            clientes.save(new Cliente("Ricard"));
            clientes.save(new Cliente("Outro Cliente"));

            boolean existe = clientes.existsByNome("Ricardo");
            System.out.println("existe um cliente com nome Ricardo? " + existe);

        };
    }

    public static void main(String[] args) {
        SpringApplication.run(VendasApplication.class, args);
    }
}
