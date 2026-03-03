package ginmasio.proyecto.apiTrabajadores.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ginmasio.proyecto.apiTrabajadores.model.Trabajador;

public interface TrabajadorRepository extends JpaRepository<Trabajador, Long> {
}