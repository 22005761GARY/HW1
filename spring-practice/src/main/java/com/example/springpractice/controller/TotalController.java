package com.example.springpractice.controller;

import com.example.springpractice.model.Order;
import com.example.springpractice.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/profit")
public class TotalController {

    @Autowired
    OrderService orderService;

    @GetMapping("/all")
    public String calTotal(Model model){
        Order total = this.orderService.calTotal();
        model.addAttribute("total", total);
        return "totPrice";
    }

}
