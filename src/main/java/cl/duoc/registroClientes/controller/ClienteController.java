package cl.duoc.registroClientes.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cl.duoc.registroClientes.model.Cliente;
import cl.duoc.registroClientes.service.ClienteService;
import jakarta.validation.Valid;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/api/v1/clientes")
public class ClienteController {
    @Autowired
    private ClienteService clienteService;

    @GetMapping
    public ResponseEntity<List<Cliente>> listarClientes(){
        List<Cliente> lista = clienteService.getClientes();
        return ResponseEntity.ok(lista);
    }
    
    @PostMapping
    public ResponseEntity<Cliente> agregarCliente(@Valid @RequestBody Cliente cliente){
        Cliente nuevo = clienteService.agregarCliente(cliente);
        return ResponseEntity.status(HttpStatus.CREATED).body(nuevo);
    }

    @DeleteMapping("{mail}")
    public ResponseEntity<String> eliminarCliente(@Valid @PathVariable String mail){
        String resultado = clienteService.eliminarCliente(mail);
        if (resultado == null){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(resultado);
    }
}
