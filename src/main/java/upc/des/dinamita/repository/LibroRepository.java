package upc.des.dinamita.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import upc.des.dinamita.entities.Libro;

public interface LibroRepository extends JpaRepository<Libro, Integer> {
}
