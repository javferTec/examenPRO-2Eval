package es.cesguiro.proyect1daw.controller;

import es.cesguiro.proyect1daw.common.AppPropertiesReader;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("")
    public String main() {
        System.out.println("ruta raíz");
        System.out.println(AppPropertiesReader.getProperty("app.name"));
        return "index";
    }
}
