package cl.duoc.registroClientes.repository;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import cl.duoc.registroClientes.model.Cliente;

@Repository
public class ClienteRepository {
    private List<Cliente> listaCliente = new ArrayList<>();

    {
        listaCliente.add(new Cliente(1,  12345678, "9", "Juan",      "Carlos",   "González",  "Pérez",    "juan.gonzalez@gmail.com",      912345678, LocalDate.of(1990, 5,  15)));
        listaCliente.add(new Cliente(2,  9876543,  "K", "María",     "José",     "Rodríguez", "López",    "maria.rodriguez@hotmail.com",  987654321, LocalDate.of(1985, 3,  22)));
        listaCliente.add(new Cliente(3,  15234567, "3", "Pedro",     "Ignacio",  "Martínez",  "Soto",     "pedro.martinez@gmail.com",     934567890, LocalDate.of(1995, 8,  10)));
        listaCliente.add(new Cliente(4,  8765432,  "1", "Ana",       "Lucía",    "Hernández", "Fuentes",  "ana.hernandez@yahoo.com",      945678901, LocalDate.of(1988, 11, 30)));
        listaCliente.add(new Cliente(5,  11223344, "5", "Luis",      "Andrés",   "Muñoz",     "Vargas",   "luis.munoz@gmail.com",         956789012, LocalDate.of(1992, 7,  18)));
        listaCliente.add(new Cliente(6,  7654321,  "2", "Carla",     "Andrea",   "Torres",    "Navarro",  "carla.torres@outlook.com",     967890123, LocalDate.of(2000, 1,   5)));
        listaCliente.add(new Cliente(7,  13456789, "7", "Diego",     "Esteban",  "Flores",    "Castillo", "diego.flores@gmail.com",       978901234, LocalDate.of(1997, 4,  25)));
        listaCliente.add(new Cliente(8,  6543210,  "4", "Valentina", "Paz",      "Reyes",     "Morales",  "valentina.reyes@gmail.com",    989012345, LocalDate.of(2001, 9,  14)));
        listaCliente.add(new Cliente(9,  14567890, "6", "Sebastián", "Felipe",   "Castro",    "Jiménez",  "sebastian.castro@gmail.com",   990123456, LocalDate.of(1983, 6,   3)));
        listaCliente.add(new Cliente(10, 5432109,  "8", "Sofía",     "Beatriz",  "Rojas",     "Mendoza",  "sofia.rojas@hotmail.com",      901234567, LocalDate.of(1999, 12, 20)));
    }
    
    public List <Cliente> obtenerClientes(){
        return listaCliente;
    }
    public Cliente buscarPorMail (String mail) {
        for (Cliente cliente : listaCliente){
            if (cliente.getCorreo().equals(mail)){
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

    public Cliente agregar (Cliente cliente){
        
        listaCliente.add(cliente);
        return cliente;
    }


    public void eliminarCliente (String correo){
        Cliente cliente = buscarPorMail(correo);
        if (cliente != null){
            listaCliente.remove(cliente);
        }
    }
}
