package upc.des.dinamita.entities;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "HAN_LIBROS")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Libro {

    @Id
    @NotNull
    @Basic(optional = false)
    @Column(name = "LIB_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer libId;

    @Column(name = "LIB_TITULO")
    private String libTitulo;

    @Column(name = "LIB_PRECIO_FIS")
    private Double libPrecioFis;

    @Column(name = "LIB_PRECIO_DIG")
    private Double libPrecioDig;

    @Column(name = "LIB_DESCRIPCION")
    private String libDescripcion;

    @Column(name = "LIB_STOCK")
    private Integer libStock;

    @Column(name = "LIB_RATING")
    private Integer libRating;

    @Lob
    @Column(name = "LIB_IMG_1")
    private byte[] libImg1;

    @Lob
    @Column(name = "LIB_IMG_2")
    private byte[] libImg2;

    @Lob
    @Column(name = "LIB_IMG_3")
    private byte[] libImg3;

    @Lob
    @Column(name = "LIB_IMG_4")
    private byte[] libImg4;

    @Lob
    @Column(name = "LIB_IMG_5")
    private byte[] libImg5;
}
