package es.cesguiro.proyect1daw.integration.persistence;

import es.cesguiro.proyect1daw.common.IoCContainer.BookIoCContainer;
import es.cesguiro.proyect1daw.domain.entity.Book;
import es.cesguiro.proyect1daw.domain.repository.BookRepository;
import org.flywaydb.core.Flyway;
import org.flywaydb.core.api.MigrationInfo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BookRepositoryIntegrationTest {

    private final BookRepository bookRepository = BookIoCContainer.getBookRepository();

    @BeforeEach
    public void beforeEach(){
        // Configuración de Flyway
        Flyway flyway = Flyway.configure().dataSource("jdbc:h2:mem:testdb", "sa", "sa").load();

        // Ejecución de migraciones
        flyway.migrate();

        // Verificar que las migraciones se hayan ejecutado correctamente
        for (MigrationInfo migrationInfo : flyway.info().all()) {
            System.out.println("Migración ejecutada: " + migrationInfo.getDescription());
        }

    }
    @Test
    public void testFindAll() {
        Book expectedSecondBook = new Book(
                "9788426418197",
                "El nombre de la rosa",
                "Valiéndose de las características de la novela gótica...",
                new BigDecimal(12.30).setScale(2, RoundingMode.HALF_UP),
                "nombreRosa.jpeg");
        List<Book> books = bookRepository.findAll();
        assertEquals(expectedSecondBook, books.get(1));
    }
}
