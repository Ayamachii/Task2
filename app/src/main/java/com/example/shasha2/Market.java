package com.example.shasha2;

import android.graphics.drawable.Drawable;

public class Market {
    public Drawable productImage;
    public String productName;
    public String productInfo;
    public float productPrice;

    public Market(Drawable productImage, String productName, String productInfo, float productPrice) {
        this.productImage = productImage;
        this.productName = productName;
        this.productInfo = productInfo;
        this.productPrice = productPrice;
    }
}
