package ru.lipatovs.shiftstuff.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import ru.lipatovs.shiftstuff.repositories.OrderRepository;

@Controller
public class OrderController {
    @Autowired
    private OrderRepository orderRepository;

    @GetMapping("/order")
    public String getOrderList(Model model){
        model.addAttribute("orders",orderRepository.findAll());
        return "orders/list";
    }
}
