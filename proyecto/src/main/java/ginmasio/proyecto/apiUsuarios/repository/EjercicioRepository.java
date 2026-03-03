package ginmasio.proyecto.apiUsuarios.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import ginmasio.proyecto.apiUsuarios.model.Ejercicio;

public interface EjercicioRepository extends JpaRepository<Ejercicio, Long> {
    // Spring crea automáticamente la consulta para filtrar por el ID del usuario
    List<Ejercicio> findByUsuarioId(Long usuarioId);
}