package cl.duoc.registroClientes.model;

import java.time.LocalDate;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@NotBlank

public class Cliente {
    private int id;
    private int numRun;
    private String dvRun;
    private String pnombre;
    private String snombre;
    private String appaterno;
    private String apmaterno;
    private String correo;
    private int fono;
    private LocalDate fechaNacimiento;
}
