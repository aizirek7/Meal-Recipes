package com.example.mealrecipes;

public class Order {
    private int goodImage;
    private String goodTitle;
    private String goodDescription;
    private String goodTextTime;

    public Order(int goodImage, String goodTitle, String goodDescription, String goodTextTime) {
        this.goodImage = goodImage;
        this.goodTitle = goodTitle;
        this.goodDescription = goodDescription;
        this.goodTextTime = goodTextTime;
    }


    public int getGoodImage() {
        return goodImage;
    }

    public String getGoodTitle() {
        return goodTitle;
    }

    public String getGoodDescription() {
        return goodDescription;
    }

    public String getGoodTextTime() {
        return goodTextTime;
    }
}
