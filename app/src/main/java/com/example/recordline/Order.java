package com.example.recordline;

public class Order {
    private int quantity;
    private double pricePerItem;
    private String username, orderMessage;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Order() {
        quantity = 1;
    }

    public double getPricePerItem() {
        return pricePerItem;
    }

    public void setPricePerItem(double pricePerItem) {
        this.pricePerItem = pricePerItem;
    }

    public void increaseQuantity() {
        quantity++;
    }

    public void decreaseQuantity() {
        if (quantity > 1 ) {
            quantity--;
        }
    }

    public int getQuantity() {
        return quantity;
    }

    public double getTotalPrice() {
        return quantity*pricePerItem;
    }

    public String getOrderMessage() {
        orderMessage = "Thank you for your order, " + username ;
        orderMessage += "\nYour total price is " + String.valueOf(getTotalPrice());
        return orderMessage;
    }
}
