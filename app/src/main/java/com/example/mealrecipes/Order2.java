package com.example.mealrecipes;

public class Order2 {

    private int foodImage;
    private  String foodName;
    private String timePreb;
    private  String timeCook;
    private String kcal;
    private String serves;
    private String method;


    public Order2(int foodImage, String foodName, String timePreb, String timeCook, String kcal, String serves, String method) {
        this.foodImage = foodImage;
        this.foodName = foodName;
        this.timePreb = timePreb;
        this.timeCook = timeCook;
        this.kcal = kcal;
        this.serves = serves;
        this.method = method;
    }

    public Order2() {

    }

    public int getFoodImage() {
        return foodImage;
    }

    public String getFoodName() {
        return foodName;
    }

    public String getTimePreb() {
        return timePreb;
    }

    public String getTimeCook() {
        return timeCook;
    }

    public String getKcal() {
        return kcal;
    }

    public String getServes() {
        return serves;
    }

    public String getMethod() {
        return method;
    }



}