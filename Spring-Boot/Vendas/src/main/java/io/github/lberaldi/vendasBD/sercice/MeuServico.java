package io.github.lberaldi.vendasBD.sercice;

import io.github.lberaldi.vendasBD.repository.MeuRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import io.github.lberaldi.vendasBD.model.Cliente;

@Service
public class MeuServico {
    private MeuRepositorio  repository;

    @Autowired
    public MeuServico(MeuRepositorio repository) {
        this.repository = repository;
    }

    public void salvarCliente(Cliente cliente){
        validarCliente(cliente);
        MeuRepositorio clienteRepositorio = new MeuRepositorio();
        clienteRepositorio.persistir(cliente);
    }

    public void validarCliente(Cliente cliente){
//        Aplica validações de cliente
    }
}
