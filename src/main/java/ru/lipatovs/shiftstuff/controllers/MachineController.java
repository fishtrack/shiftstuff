package ru.lipatovs.shiftstuff.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import ru.lipatovs.shiftstuff.repositories.MachineRepository;

@Controller
public class MachineController {
    @Autowired
    private MachineRepository machineRepository;

    @GetMapping("/machine")
    public String getMachineList(Model model){
        model.addAttribute("machines",machineRepository.findAll());
        return "machines/list";
    }

}
