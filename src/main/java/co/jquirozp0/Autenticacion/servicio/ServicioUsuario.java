package co.jquirozp0.Autenticacion.servicio;

import co.jquirozp0.Autenticacion.entidad.Usuario;
import co.jquirozp0.Autenticacion.repositorio.UsuarioRepositorio;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.List;

@AllArgsConstructor
@Service
public class ServicioUsuario implements Serializable {
    @Autowired
    UsuarioRepositorio usuarioRepositorio;
    public Usuario buscarUsuario(long id) {
        Optional<Usuario> opcional = this.usuarioRepositorio.findById((long) id).orElse(null);
    }
    public List<Usuario> buscarUsuarios() {
        return
    }
}
