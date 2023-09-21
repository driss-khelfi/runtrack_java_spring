package com.example.demo6;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
@RequestMapping("/persons")
public class PersonController {

    @Autowired
    private PersonRepository personRepository;

    // Afficher le formulaire de mise à jour
    @GetMapping("/edit/{id}")
    public String editPersonForm(@PathVariable Long id, Model model) {
        Optional<Person> optionalPerson = personRepository.findById(id);
        if (optionalPerson.isPresent()) {
            model.addAttribute("person", optionalPerson.get());
            return "editPerson";
        } else {
            // Gérer le cas où la personne n'a pas été trouvée
            return "redirect:/persons/list";
        }
    }

    // Gérer la soumission du formulaire de mise à jour
    @PostMapping("/update")
    public String updatePerson(@ModelAttribute Person updatedPerson) {
        personRepository.save(updatedPerson);
        return "redirect:/persons/list";
    }

    // Afficher la page de confirmation de suppression
    @GetMapping("/delete/{id}")
    public String deletePersonConfirmation(@PathVariable Long id, Model model) {
        Optional<Person> optionalPerson = personRepository.findById(id);
        if (optionalPerson.isPresent()) {
            model.addAttribute("person", optionalPerson.get());
            return "deleteConfirmation";
        } else {
            // Gérer le cas où la personne n'a pas été trouvée
            return "redirect:/persons/list";
        }
    }

    // Confirmer et gérer la suppression de la personne
    @PostMapping("/delete/{id}")
    public String deletePerson(@PathVariable Long id) {
        personRepository.deleteById(id);
        return "redirect:/persons/list";
    }
}
