package com.example.shasha2;

import android.graphics.drawable.Drawable;

public class Basket {
    public Drawable prodImage;
    public String prodName;
    public int quantity;
    public float prodPrice;
    public String prodDescription;
    public int nutritionQuantity;
    public int noStarts;

    public Basket(Drawable prodImage, String prodName, int quantity, float prodPrice, String prodDescription, int nutritionQuantity, int noStarts) {
        this.prodImage = prodImage;
        this.prodName = prodName;
        this.quantity = quantity;
        this.prodPrice = prodPrice;
        this.prodDescription = prodDescription;
        this.nutritionQuantity = nutritionQuantity;
        this.noStarts = noStarts;
    }
}
