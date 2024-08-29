package co.jquirozp0.Autenticacion.entidad;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity(name = "Usuario")
@Table(name = "Usuarios")
public class Usuario {
    @Id
    private Long codigo;
    private String nombreApellido;
    private String apellidoUsuario;
    private String clave;
}
