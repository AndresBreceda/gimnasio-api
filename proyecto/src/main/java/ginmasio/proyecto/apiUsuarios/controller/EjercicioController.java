package ginmasio.proyecto.apiUsuarios.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ginmasio.proyecto.apiUsuarios.model.Ejercicio;
import ginmasio.proyecto.apiUsuarios.service.EjercicioService;

@RestController
@RequestMapping("/api/ejercicios")
public class EjercicioController {

    private final EjercicioService ejercicioService;

    public EjercicioController(EjercicioService ejercicioService) {
        this.ejercicioService = ejercicioService;
    }

    // Endpoint: http://localhost:8080/api/ejercicios/usuario/1
    @GetMapping("/usuario/{usuarioId}")
    public List<Ejercicio> getEjerciciosPorUsuario(@PathVariable Long usuarioId) {
        return ejercicioService.obtenerPorUsuario(usuarioId);
    }

    @PostMapping
    public Ejercicio create(@RequestBody Ejercicio ejercicio) {
        return ejercicioService.guardar(ejercicio);
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        ejercicioService.eliminar(id);
    }
}