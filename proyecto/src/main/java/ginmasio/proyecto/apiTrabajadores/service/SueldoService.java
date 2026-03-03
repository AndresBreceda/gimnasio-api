package ginmasio.proyecto.apiTrabajadores.service;

import ginmasio.proyecto.apiTrabajadores.model.Sueldo;
import ginmasio.proyecto.apiTrabajadores.repository.SueldoRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class SueldoService {
    private final SueldoRepository repository;

    public SueldoService(SueldoRepository repository) {
        this.repository = repository;
    }

    public List<Sueldo> buscarPorTrabajador(Long id) { return repository.findByTrabajadorId(id); }
    public Sueldo guardar(Sueldo s) { return repository.save(s); }
    public void eliminar(Long id) { repository.deleteById(id); }
}