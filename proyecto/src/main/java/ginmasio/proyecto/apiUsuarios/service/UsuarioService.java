package ginmasio.proyecto.apiUsuarios.service;

import java.util.List;

import org.springframework.stereotype.Service;

import ginmasio.proyecto.apiUsuarios.model.Usuario;
import ginmasio.proyecto.apiUsuarios.repository.UsuarioRepository;

@Service
public class UsuarioService {

    private final UsuarioRepository usuarioRepository;

    public UsuarioService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    public List<Usuario> listarTodos() {
        return usuarioRepository.findAll();
    }
    
    public void eliminar(Long id) {
        usuarioRepository.deleteById(id);
    }

    public Usuario guardar(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }
}