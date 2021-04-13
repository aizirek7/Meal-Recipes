package com.example.mealrecipes;

import java.util.ArrayList;

public class DB {
    private ArrayList<Order> orders = new ArrayList<>();
    private ArrayList<Order2> order2s = new ArrayList<>();
    private ArrayList<Order> favourite = new ArrayList<>();

    public ArrayList<Order> getOrders() {
        return orders;
    }

    public ArrayList<Order2> getOrder2s() {
        return order2s;
    }

    public ArrayList<Order> getFavourite() {
        return favourite;
    }
}
