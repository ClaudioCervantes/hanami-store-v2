package upc.des.dinamita.resource;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import upc.des.dinamita.dto.Response;
import upc.des.dinamita.entities.Libro;
import upc.des.dinamita.service.LibroService;
import upc.des.dinamita.utils.ErroresEnum;

import java.util.Optional;

@Slf4j
@Component
public class LibroResource {

    @Autowired
    private LibroService libroService;

    public ResponseEntity<Response<Libro>> buscarLibro(Integer id) {
        log.info("Inicia servicio de busqueda de libro con id: {}", id);

        Optional<Libro> opLibro;
        Response<Libro> response;

        try {
            opLibro = libroService.buscarPorId(id);

            if (!opLibro.isPresent()) {
                response = new Response<>(ErroresEnum.SEARCH_ERROR);
                return new ResponseEntity<>(response, HttpStatus.OK);
            }

            response = new Response<>(ErroresEnum.OK, opLibro.get());
        } catch (Exception e) {
            response = new Response<>(ErroresEnum.SEARCH_ERROR);
        }

        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
