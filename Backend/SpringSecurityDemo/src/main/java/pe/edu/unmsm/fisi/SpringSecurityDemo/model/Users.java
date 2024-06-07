package pe.edu.unmsm.fisi.SpringSecurityDemo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "users")
public class Users {
    @Id
    private String DNI;
    private String codigoVerificacion;
    private String nombres;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private String telefono;
    private String direccion;
    private Date fechaContratacion;
    private String email;
    private String pass;

}
