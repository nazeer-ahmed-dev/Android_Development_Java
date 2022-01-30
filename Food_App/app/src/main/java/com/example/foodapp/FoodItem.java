package com.example.foodapp;

public class FoodItem {


    String name;
    int pic;
    int quantity;
    int price;
    int id;

    FoodItem(String name , int pic , int quantity , int price , int id)
    {
        this.name = name;
        this.pic = pic;
        this.quantity = quantity;
        this.price  = price;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getPic() {
        return pic;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getPrice() {
        return price;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPic(int pic) {
        this.pic = pic;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setId(int id) {
        this.id = id;
    }
}
