package ginmasio.proyecto.apiTrabajadores.controller;

import ginmasio.proyecto.apiTrabajadores.model.Trabajador;
import ginmasio.proyecto.apiTrabajadores.service.TrabajadorService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/trabajadores")
public class TrabajadorController {
    private final TrabajadorService service;

    public TrabajadorController(TrabajadorService service) {
        this.service = service;
    }

    @GetMapping
    public List<Trabajador> getAll() { return service.listar(); }

    @PostMapping
    public Trabajador save(@RequestBody Trabajador t) { return service.guardar(t); }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.eliminar(id); }
}