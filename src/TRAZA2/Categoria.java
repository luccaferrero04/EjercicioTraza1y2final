package TRAZA2;

import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.HashSet;
import java.util.Set;

;



@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString

@SuperBuilder
public class Categoria {
    private Long id;
    private String denominacion;
    private boolean esInsumo;

    @Builder.Default
    private Set<Articulo> articulos = new HashSet<>();


}
