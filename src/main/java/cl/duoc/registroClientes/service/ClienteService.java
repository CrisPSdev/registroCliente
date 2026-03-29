package cl.duoc.registroClientes.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.duoc.registroClientes.repository.ClienteRepository;
import cl.duoc.registroClientes.model.Cliente;


@Service
public class ClienteService {
    @Autowired
    private ClienteRepository clienteRepository;

    public List<Cliente> getClientes(){
        return clienteRepository.obtenerClientes();
    }

    public Cliente agregarCliente (Cliente c){
        return clienteRepository.agregar(c);
    }

    public String eliminarCliente (String c){
        clienteRepository.eliminarCliente(c);
        return "Eliminado";
    }
 }
