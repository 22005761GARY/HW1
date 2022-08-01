package com.example.springpractice.service;

import com.example.springpractice.model.Meal;
import com.example.springpractice.model.Order;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class OrderService {
    List<Order> orderList = new ArrayList<>();
//    List<Meal> meals;
    List<Meal> meals = new ArrayList<>();

    int total = 0;
    public  OrderService(){

//        this.meals = new ArrayList<>();
        meals.add(new Meal("Burger", 200, "Tasty"));
        meals.add(new Meal("cake", 150, "Sweet"));
        this.orderList.add(new Order("1", 200, "Gary", meals));
        this.orderList.add(new Order("2", 150, "Jason", meals));
    }

    public Order getOrderBySeq(String seq){
        for(int i = 0;i < this.orderList.size(); i++){
            if(this.orderList.get(i).getSeq().equals(seq)){
                return  this.orderList.get(i);
            }
        }
        return null;
    }

    public Order calTotal(){
        for(int j = 0;j < this.orderList.size();j++){
            this.total += this.orderList.get(j).getTotPrice();
        }
        this.orderList.add(new Order("all", 0, "all", meals));
        this.orderList.get(orderList.size()-1).setTotPrice(total);
        return this.orderList.get(orderList.size()-1);
    }

}
