package com.example.myapplicationsafaa7;

import java.io.Serializable;

public class Items implements Serializable{
    private String ItemName;
    private int ItemImage;
    private double ItemPrice;

    public String getItemName() {
        return ItemName;
    }

    public void setItemName(String itemName) {
        ItemName = itemName;
    }

    public int getItemImage() {
        return ItemImage;
    }

    public void setItemImage(int itemImage) {
        ItemImage = itemImage;
    }

    public double getItemPrice() {
        return ItemPrice;
    }

    public void setItemPrice(double itemPrice) {
        ItemPrice = itemPrice;
    }

    public Items(String itemName, int itemImage, double itemPrice) {
        ItemName = itemName;
        ItemImage = itemImage;
        ItemPrice = itemPrice;

    }
}
