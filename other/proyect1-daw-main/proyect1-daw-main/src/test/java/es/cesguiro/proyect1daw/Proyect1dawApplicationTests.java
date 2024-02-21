package es.cesguiro.proyect1daw;

import es.cesguiro.proyect1daw.common.AppPropertiesReader;
//import org.flywaydb.test.annotation.FlywayTest;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Proyect1dawApplicationTests {

	@Test
	void contextLoads() {
		System.out.println(AppPropertiesReader.getProperty("app.name"));
	}

}
