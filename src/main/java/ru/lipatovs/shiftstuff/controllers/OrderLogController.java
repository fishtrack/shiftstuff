package ru.lipatovs.shiftstuff.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import ru.lipatovs.shiftstuff.repositories.OrderLogRepository;

@Controller
public class OrderLogController {
    @Autowired
    private OrderLogRepository orderLogRepository;

    @GetMapping("/orderlog")
    public String getOrderLogList(Model model){
        model.addAttribute("orderlogs",orderLogRepository.findAll());
        return "orederlogs/list";
    }
}
