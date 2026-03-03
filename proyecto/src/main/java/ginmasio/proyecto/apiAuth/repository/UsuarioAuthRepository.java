package ginmasio.proyecto.apiAuth.repository;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import ginmasio.proyecto.apiAuth.model.UsuarioAuth;

public interface UsuarioAuthRepository 
        extends JpaRepository<UsuarioAuth, Long> {

    Optional<UsuarioAuth> findByUsername(String username);
}