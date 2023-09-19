package com.example.Jour2.viewController;

import com.example.Jour2.MyObject;
import com.example.Jour2.MyObject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
public class viewController {

    @GetMapping("/view")
    public String viewPage(Model model) {

        return "view";
    }

    // Supprimez cette méthode qui a la même annotation
    // @GetMapping("/view")
    // public String viewPage() {
    //     return "view";
    // }

    @PostMapping("/submit")
    public String submitForm(@RequestParam("name") String name, Model model) {
        String message = "Bienvenue, " + name + " !";
        model.addAttribute("message", message);
        return "welcome"; // Créez une nouvelle page HTML (welcome.html) pour afficher le message de bienvenue
    }
}
