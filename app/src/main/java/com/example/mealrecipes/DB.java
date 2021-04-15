package com.example.mealrecipes;

import java.util.ArrayList;

public class DB {
    private static ArrayList<Order> orders = new ArrayList<>();
    private static ArrayList<Order2> order2s = new ArrayList<>();
    private static ArrayList<Order> favourite = new ArrayList<>();

    public static ArrayList<Order> getOrders() {
        return orders;
    }

    public static ArrayList<Order2> getOrder2s() {
        return order2s;
    }

    public ArrayList<Order> getFavourite() {
        return favourite;
    }

    public static ArrayList<Order> orders2 = new ArrayList<>();

    public static void addOrder (Order order){
        orders2.add(order);
    }



}
