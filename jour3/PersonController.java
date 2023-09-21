package com.example.demo6;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/persons") // L'URL de base pour ce contrôleur
public class PersonController {

    @Autowired
    private PersonRepository personRepository;

    @GetMapping("/list")
    public String listPersons(Model model) {
        // Récupérer la liste des personnes depuis le repository
        Iterable<Person> persons = personRepository.findAll();

        // Ajouter la liste des personnes à l'objet Model pour l'affichage
        model.addAttribute("persons", persons);

        // Retourner le nom de la vue à afficher (par exemple, "personList")
        return "personList";
    }

    @GetMapping("/create")
    public String createPersonForm() {
        // Afficher le formulaire de création de personne (s'il y en a un)
        return "personForm";
    }

    @PostMapping("/create")
    public String createPerson(Person person) {
        // Enregistrer la nouvelle personne dans le repository
        personRepository.save(person);

        // Rediriger vers la liste des personnes après la création
        return "redirect:/persons/list";
    }
}
