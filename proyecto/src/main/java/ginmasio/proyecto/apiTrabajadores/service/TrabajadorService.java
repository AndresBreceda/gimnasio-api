package ginmasio.proyecto.apiTrabajadores.service;

import java.util.List;

import org.springframework.stereotype.Service;

import ginmasio.proyecto.apiTrabajadores.model.Trabajador;
import ginmasio.proyecto.apiTrabajadores.repository.TrabajadorRepository;

@Service
public class TrabajadorService {
    private final TrabajadorRepository repository;

    public TrabajadorService(TrabajadorRepository repository) {
        this.repository = repository;
    }

    public List<Trabajador> listar() { return repository.findAll(); }
    public Trabajador guardar(Trabajador t) { return repository.save(t); }
    public void eliminar(Long id) { repository.deleteById(id); }
}