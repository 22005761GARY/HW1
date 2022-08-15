package com.example.springpractice.service;

import com.example.springpractice.model.Meal;
import com.example.springpractice.model.Order;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class OrderService {
    List<Order> orderList = new ArrayList<>();
//     List<Meal> meals = new ArrayList<>();


    public  OrderService(){
        List<Meal> mealList1 = new ArrayList<>();
        mealList1.add(new Meal("Burger", 200, "Tasty"));
        List<Meal> mealList2 = new ArrayList<>();
        mealList2.add(new Meal("cake", 150, "Sweet"));

        this.orderList = new ArrayList<>();
        this.orderList.add(new Order(1, 200, "Gary", mealList1));
        this.orderList.add(new Order(2, 150, "Jason", mealList2));
    }

    public Order getOrderBySeq(int seq){
        for(int i = 0;i < this.orderList.size(); i++){
            if(seq == this.orderList.get(i).getSeq()){
                return  this.orderList.get(i);
            }
        }
        return null;
    }

    public  List<Order> getOrderList(){
        return this.orderList;
    }
    public int calTotal(){
        int total = 0;
//        for(int j = 0;j < this.orderList.size();j++){
//            total += this.orderList.get(j).getTotPrice();
//        }
//        this.orderList.add(new Order(3, 0, "all", new ArrayList<>()));
//        this.orderList.get(orderList.size()-1).setTotPrice(total);
//        return this.orderList.get(orderList.size()-1);
        for(int i = 0;i < this.orderList.size();i++){
            total += orderList.get(i).getTotPrice();
        }
        return  total;
    }

}
