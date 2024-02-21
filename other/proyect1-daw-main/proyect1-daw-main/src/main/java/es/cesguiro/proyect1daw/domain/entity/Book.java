package es.cesguiro.proyect1daw.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data //incluye @Getter, @Setter, @ToString y @EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class Book {

    private String isbn;
    private String title;
    private String synopsis;
    private BigDecimal price;
    private String cover;
}
