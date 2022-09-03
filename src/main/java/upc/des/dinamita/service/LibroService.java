package upc.des.dinamita.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import upc.des.dinamita.entities.Libro;
import upc.des.dinamita.repository.LibroRepository;

import java.util.List;
import java.util.Optional;

@Service
public class LibroService implements CRUDService<Libro, Integer> {

    @Autowired
    private LibroRepository libroRepository;

    @Override
    public Libro crear(Libro entidad) {
        return libroRepository.save(entidad);
    }

    @Override
    public List<Libro> crear(List<Libro> entidades) {
        return libroRepository.saveAll(entidades);
    }

    @Override
    public List<Libro> buscarTodo() {
        return libroRepository.findAll();
    }

    @Override
    public Optional<Libro> buscarPorId(Integer id) {
        return libroRepository.findById(id);
    }

    @Override
    public void modificar(Libro entidad) {
        libroRepository.save(entidad);
    }
}
