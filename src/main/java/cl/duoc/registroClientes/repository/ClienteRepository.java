package cl.duoc.registroClientes.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import cl.duoc.registroClientes.model.Cliente;

@Repository
public class ClienteRepository {
    private List<Cliente> listaCliente = new ArrayList<>();
    
    public Cliente buscarPorId (int id) {
        for (Cliente cliente : listaCliente){
            if (cliente.getId() == id){
                return cliente;
            }
        }
        return null;
    }

    public Cliente buscarPorRun (int numRun, String dvRun) {
        for (Cliente cliente : listaCliente){
            if (cliente.getNumRun() == numRun && cliente.getDvRun().equals(dvRun)){
                return cliente;
            }
        }
        return null;
    }

    
}
