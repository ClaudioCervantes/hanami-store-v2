package upc.des.dinamita.service;

import java.util.List;
import java.util.Optional;

public interface CRUDService<E, ID> {
    E crear(E entidad);
    List<E> crear(List<E> entidades);
    List<E> buscarTodo();
    Optional<E> buscarPorId(ID id);
    void modificar(E entidad);
}
