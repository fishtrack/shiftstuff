package ru.lipatovs.shiftstuff.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import ru.lipatovs.shiftstuff.repositories.PersonRepository;

@Controller
public class PersonController {
    @Autowired
    private PersonRepository personRepository;

    @GetMapping("/persons")
    public String getPersonList(Model model){
        model.addAttribute("persons", personRepository.findAll());
        return "persons/list";
    }

}