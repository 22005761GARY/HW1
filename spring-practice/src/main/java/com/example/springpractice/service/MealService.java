package com.example.springpractice.service;

import com.example.springpractice.model.Meal;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MealService {
    List<Meal> meals;
    public MealService(List<Meal> meals){
        this.meals = new ArrayList<>();
        this.meals.add(new Meal("Burger", 200, "Tasty"));
    }
    public Meal getMealByName(String name){
        for(int i = 0;i < this.meals.size(); i++){
            if(this.meals.get(i).getName().toLowerCase().equals(name.toLowerCase())){
                return  this.meals.get(i);
            }
        }
        return null;
    }


}
