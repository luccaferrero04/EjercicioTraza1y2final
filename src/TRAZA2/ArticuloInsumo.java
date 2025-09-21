package TRAZA2;


import lombok.*;
import lombok.experimental.SuperBuilder;




@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
@SuperBuilder

public class ArticuloInsumo extends Articulo {
    private Double precioCompra;
    private Integer stockActual;
    private Integer stockMaximo;
    private Boolean esParaElaborar;

}
