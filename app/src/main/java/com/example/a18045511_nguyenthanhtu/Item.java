package com.example.a18045511_nguyenthanhtu;

public class Item {
    private String name;
    private String price;
    private int imageItem;

    public Item(String name, String price, int imageItem) {
        this.name = name;
        this.price = price;
        this.imageItem = imageItem;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public int getImageItem() {
        return imageItem;
    }

    public void setImageItem(int imageItem) {
        this.imageItem = imageItem;
    }
}
