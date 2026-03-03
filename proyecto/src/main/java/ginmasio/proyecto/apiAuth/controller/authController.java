package ginmasio.proyecto.apiAuth.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import ginmasio.proyecto.apiAuth.service.AuthService;
import ginmasio.proyecto.apiAuth.Dto.LoginRequest;

@RestController
@RequestMapping("/api")
public class authController {
    private final AuthService service;

    public authController(AuthService service) {
        this.service = service;
    }

    @PostMapping("/login")
    public String login(@RequestBody LoginRequest request) {

        boolean valido = service.validarCredenciales(
                request.getUsername(),
                request.getPassword()
        );

        if (!valido) {
            throw new ResponseStatusException(
                    HttpStatus.UNAUTHORIZED,
                    "Credenciales inválidas"
            );
        }

        return "TOKEN123";
    }
}