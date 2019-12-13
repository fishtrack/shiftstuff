package ru.lipatovs.shiftstuff.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import ru.lipatovs.shiftstuff.repositories.ShiftRepository;

@Controller
public class ShiftController {
    @Autowired
    private ShiftRepository shiftRepository;

    @GetMapping("/shift")
    public String getShiftList(Model model){
        model.addAttribute("shifts", shiftRepository.findAll());
        return "shifts/list";
    }
}
