package co.jquirozp0.Autenticacion.controlador;

import co.jquirozp0.Autenticacion.entidad.Usuario;
import co.jquirozp0.Autenticacion.servicio.ServicioUsuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.swing.text.html.parser.Entity;
import java.io.Serializable;
@RequestMapping("/api/usuarios")
@RestController
public class UsuarioControlador implements Serializable {
    @Autowired
    ServicioUsuario servicioUsuario;
    @GetMapping("/{serial}")
    public ResponseEntity<Usuario> obtenerPorId(@PathVariable("serial") Long serial) {
        log.info( " Ïngresa serial "+ serial);
        return ResponseEntity.ok(servicioUsuario.buscarUsuario(serial));
    }
}
