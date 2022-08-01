package com.example.springpractice.model;



import java.util.List;

public class Order{
    private String seq;
    private int totPrice;
    private String waiter;
    private List<Meal>meals;


    public Order(String seq, int totPrice, String waiter, List<Meal> meals) {


        this.seq = seq;
        this.totPrice = totPrice;
        this.waiter = waiter;
        this.meals = meals;
    }

    public String getSeq() {
        return seq;
    }

    public int getTotPrice() {
        return totPrice;
    }

    public String getWaiter() {
        return waiter;
    }

    public List<Meal> getMeals() {
        return meals;
    }

    public void setSeq(String seq) {
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
