package ginmasio.proyecto.apiUsuarios.service;

import java.util.List;

import org.springframework.stereotype.Service;

import ginmasio.proyecto.apiUsuarios.model.Ejercicio;
import ginmasio.proyecto.apiUsuarios.repository.EjercicioRepository;

@Service
public class EjercicioService {

    private final EjercicioRepository ejercicioRepository;

    public EjercicioService(EjercicioRepository ejercicioRepository) {
        this.ejercicioRepository = ejercicioRepository;
    }

    public List<Ejercicio> obtenerPorUsuario(Long usuarioId) {
        return ejercicioRepository.findByUsuarioId(usuarioId);
    }

    

    public Ejercicio guardar(Ejercicio ejercicio) {
        return ejercicioRepository.save(ejercicio);
    }

    public void eliminar(Long id) {
        ejercicioRepository.deleteById(id);
    }
}