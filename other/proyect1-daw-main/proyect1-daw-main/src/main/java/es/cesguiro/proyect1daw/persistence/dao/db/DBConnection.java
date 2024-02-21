package es.cesguiro.proyect1daw.persistence.dao.db;

import es.cesguiro.proyect1daw.common.AppPropertiesReader;
import lombok.Getter;
import lombok.extern.log4j.Log4j2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

@Log4j2
public class DBConnection {

    @Getter
    private final Connection connection;

    public DBConnection() {
        log.info("Estableciendo conexión....");
        try {
            connection = DriverManager.getConnection(
                    AppPropertiesReader.getProperty("app.datasource.url"),
                    AppPropertiesReader.getProperty("app.datasource.username"),
                    AppPropertiesReader.getProperty("app.datasource.password")
            );
            //log.warn("Conexión establecida con la bbdd");
            log.info("Conexión establecida con la bbdd");
        } catch (SQLException e) {
            log.error("Error al conectar con la bbdd . Parámetros: " + getParameters());
            throw new RuntimeException("Connection paramaters :\n\n" + getParameters() + "\nOriginal exception message: " + e.getMessage());
        }
    }


    private String getParameters (){
        return String.format("url: %s\nUser: %s\nPassword: %s\n",
                AppPropertiesReader.getProperty("app.datasource.url"),
                AppPropertiesReader.getProperty("app.datasource.username"),
                AppPropertiesReader.getProperty("app.datasource.password")
        );
    }

}
