package com.example.demo6;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class MyController {

    @GetMapping("/")
    public String index() {
        return "view"; // Retourne le nom de la vue sans l'extension ".html"
    }
}
