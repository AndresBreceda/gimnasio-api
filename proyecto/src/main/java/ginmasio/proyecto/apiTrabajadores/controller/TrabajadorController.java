package ginmasio.proyecto.apiTrabajadores.controller;

import ginmasio.proyecto.apiTrabajadores.model.Trabajador;
import ginmasio.proyecto.apiTrabajadores.service.TrabajadorService;
import ginmasio.proyecto.apiAuth.Util.AuthUtil; // <-- importamos el util
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
    public List<Trabajador> getAll(@RequestHeader("Authorization") String authHeader) {
        AuthUtil.checkToken(authHeader); // <-- validación centralizada
        return service.listar();
    }

    @PostMapping
    public Trabajador save(@RequestHeader("Authorization") String authHeader,
                           @RequestBody Trabajador t) {
        AuthUtil.checkToken(authHeader);
        return service.guardar(t);
    }

    @DeleteMapping("/{id}")
    public void delete(@RequestHeader("Authorization") String authHeader,
                       @PathVariable Long id) {
        AuthUtil.checkToken(authHeader);
        service.eliminar(id);
    }
}