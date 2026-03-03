package ginmasio.proyecto.apiAuth.service;

import org.springframework.stereotype.Service;
import ginmasio.proyecto.apiAuth.repository.UsuarioAuthRepository;
import ginmasio.proyecto.apiAuth.model.UsuarioAuth;

@Service
public class AuthService {

    private final UsuarioAuthRepository repository;

    public AuthService(UsuarioAuthRepository repository) {
        this.repository = repository;
    }

    public boolean validarCredenciales(String username, String password) {

        UsuarioAuth usuario = repository
                .findByUsername(username)
                .orElse(null);

        if (usuario == null) return false;

        return usuario.getPassword().equals(password);
    }
}