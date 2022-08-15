package com.example.springpractice.controller;

import com.example.springpractice.model.Meal;
import com.example.springpractice.model.Order;
import com.example.springpractice.service.MealService;
import com.example.springpractice.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping(value = "/order")
public class OrderController {
    @Autowired
    OrderService orderService;

    @GetMapping("/{seq}")
    public String getOrderBySeq(@PathVariable int seq , Model model){
        Order order = this.orderService.getOrderBySeq(seq);
        model.addAttribute("order", order);
        return "order";
    }

    @GetMapping("/income")
    public String calTotal(Model model){
        int income = this.orderService.calTotal();
        List<Order> orderList = this.orderService.getOrderList();
        model.addAttribute("order",orderList);
        model.addAttribute("income", income);
        return "income";
    }
}
