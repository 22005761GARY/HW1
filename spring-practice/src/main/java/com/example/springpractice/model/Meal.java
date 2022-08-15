package com.example.springpractice.model;

import java.util.List;

public class Meal {

    private String name;
    private int price;
    private String description;



    public Meal(String name, int price, String description) {

        this.name = name;
        this.price = price;
        this.description = description;
    }



    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
