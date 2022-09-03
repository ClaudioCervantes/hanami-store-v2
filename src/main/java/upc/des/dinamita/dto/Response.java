package upc.des.dinamita.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import upc.des.dinamita.utils.ErroresEnum;

@Getter
@Setter
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Response<D> {
    private Integer codigo;
    private String mensaje;
    private D data;

    public Response(ErroresEnum erroresEnum) {
        this.codigo = erroresEnum.getErrorCode();
        this.mensaje = erroresEnum.getErrorMessage();
    }

    public Response(ErroresEnum erroresEnum, D data) {
        this.codigo = erroresEnum.getErrorCode();
        this.mensaje = erroresEnum.getErrorMessage();
        this.data = data;
    }
}
