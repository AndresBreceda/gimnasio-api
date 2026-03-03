package ginmasio.proyecto.apiTrabajadores.controller;

import ginmasio.proyecto.apiTrabajadores.model.Sueldo;
import ginmasio.proyecto.apiTrabajadores.service.SueldoService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/sueldos")
public class SueldoController {
    private final SueldoService service;

    public SueldoController(SueldoService service) {
        this.service = service;
    }

    @GetMapping("/trabajador/{id}")
    public List<Sueldo> getByTrabajador(@PathVariable Long id) {
        return service.buscarPorTrabajador(id);
    }

    @PostMapping
    public Sueldo save(@RequestBody Sueldo s) { return service.guardar(s); }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.eliminar(id); }
}