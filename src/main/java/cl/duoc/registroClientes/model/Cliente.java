package cl.duoc.registroClientes.model;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@NotBlank

public class Cliente {
    private int rut;
    private String dv_rut;
    private String nombre;
    private String apellido;
}
