package mx.edu.utez.diagnosticospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
public class Control {

    @GetMapping("")
    public String index() {
        return "Hola desde mi backend";
    }

}
