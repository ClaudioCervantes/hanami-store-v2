package upc.des.dinamita.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import upc.des.dinamita.dto.Response;
import upc.des.dinamita.entities.Libro;
import upc.des.dinamita.resource.LibroResource;

@RestController
@RequestMapping("/api/libro")
public class LibroController {

    @Autowired
    private LibroResource libroResource;

    @GetMapping("/v1/buscar/{id}")
    public ResponseEntity<Response<Libro>> findProducts(@PathVariable Integer id) {
        return libroResource.buscarLibro(id);
    }
}
