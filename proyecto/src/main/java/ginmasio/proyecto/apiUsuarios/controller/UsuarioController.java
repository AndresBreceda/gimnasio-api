package ginmasio.proyecto.apiUsuarios.controller;

import java.util.List;

import org.springframework.web.bind.annotation.*;

import ginmasio.proyecto.apiUsuarios.model.Usuario;
import ginmasio.proyecto.apiUsuarios.service.UsuarioService;
import ginmasio.proyecto.apiAuth.Util.AuthUtil; // <-- importamos el util

@RestController
@RequestMapping("/api/usuarios")
public class UsuarioController {

    private final UsuarioService usuarioService;

    public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    @GetMapping
    public List<Usuario> getAll(@RequestHeader("Authorization") String authHeader) {
        AuthUtil.checkToken(authHeader); // <-- validación centralizada
        return usuarioService.listarTodos();
    }

    @PostMapping
    public Usuario save(@RequestHeader("Authorization") String authHeader,
                        @RequestBody Usuario usuario) {
        AuthUtil.checkToken(authHeader);
        return usuarioService.guardar(usuario);
    }

    @DeleteMapping("/{id}")
    public void delete(@RequestHeader("Authorization") String authHeader,
                       @PathVariable Long id) {
        AuthUtil.checkToken(authHeader);
        usuarioService.eliminar(id);
    }
}