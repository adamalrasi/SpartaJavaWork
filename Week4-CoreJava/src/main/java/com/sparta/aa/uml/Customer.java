package com.sparta.aa.uml;

public class Customer extends Person{
    private String deliveryAddress;
    public Customer(String firstName, String lastName, String deliveryAddress) {
        super(firstName, lastName);
        this.deliveryAddress = deliveryAddress;
    }

    @Override
    public String getDetails() {
        return "Delivery Address: " + deliveryAddress + ", " + super.getDetails();
    }
}
