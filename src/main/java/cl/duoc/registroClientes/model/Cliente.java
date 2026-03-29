package cl.duoc.registroClientes.model;

import java.time.LocalDate;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Cliente {
    @NotNull(message = "La id es obligatoria")
    private int id;

    @NotNull(message = "El rut es obligatorio")
    private int numRun;

    @NotBlank(message = "El digito verificador no puede estar vacío")
    private String dvRun;

    @NotBlank(message = "El Primer nombre no puede estar vacío")
    private String pnombre;
    private String snombre;

    @NotBlank(message = "El apellido no puede estar vacío")
    private String appaterno;
    private String apmaterno;
    
    @NotBlank(message = "El correo es obligatorio")
    private String correo;
    private int fono;
    private LocalDate fechaNacimiento;
}
