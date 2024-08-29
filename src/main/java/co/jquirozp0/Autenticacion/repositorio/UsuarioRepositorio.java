package co.jquirozp0.Autenticacion.repositorio;
import co.jquirozp0.Autenticacion.entidad.Usuario;
import co.jquirozp0.Autenticacion.repositorio.UsuarioRepositorio;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepositorio extends JpaRepository<Usuario, Long> {
}
