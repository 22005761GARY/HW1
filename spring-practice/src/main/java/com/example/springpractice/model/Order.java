package com.example.springpractice.model;

import java.util.List;

public class Order{
    private int seq;
    private int totPrice;
    private String waiter;
    private List<Meal>meals;

    public Order(int seq) {
        this.seq = seq;
    }

    public Order(List<Meal> meals) {
        this.meals = meals;
    }

    public Order(int seq, int totPrice, String waiter, List<Meal> meals) {


        this.seq = seq;
        this.totPrice = totPrice;
        this.waiter = waiter;
        this.meals = meals;
    }

    public int getSeq() {
        return seq;
    }

    public int getTotPrice() {
        int total = 0;
        for(Meal meal : this.getMeals()){
            total += meal.getPrice();
        }
        return totPrice;
    }

    public String getWaiter() {
        return waiter;
    }

    public List<Meal> getMeals() {
        return meals;
    }

    public void setSeq(int seq) {
        this.seq = seq;
    }

    public void setTotPrice(int totPrice) {
        this.totPrice = totPrice;
    }

    public void setWaiter(String waiter) {
        this.waiter = waiter;
    }

    public void setMeals(List<Meal> meals) {
        this.meals = meals;
    }
}
