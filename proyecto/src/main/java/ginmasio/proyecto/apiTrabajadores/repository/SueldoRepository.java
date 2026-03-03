package ginmasio.proyecto.apiTrabajadores.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import ginmasio.proyecto.apiTrabajadores.model.Sueldo;

public interface SueldoRepository extends JpaRepository<Sueldo, Long> {
    List<Sueldo> findByTrabajadorId(Long trabajadorId);
}