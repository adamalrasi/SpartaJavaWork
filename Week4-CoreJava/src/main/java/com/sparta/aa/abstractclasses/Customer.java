package com.sparta.aa.abstractclasses;

import java.util.Objects;

public class Customer extends Person implements Printable{
    public Customer(String firstName, String lastName){
        super(firstName, lastName);
    }

    @Override
    public void delete(){
        System.out.println("Customer has been delete");
    }

    @Override
    public void print(){
        System.out.println("Name: " + super.getFirstName());
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; // this -> the object that is calling this method

        return (obj instanceof Customer anotherCustomer)
                && getFirstName().equals(anotherCustomer.getFirstName())
                && getLastName().equals(anotherCustomer.getLastName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFirstName(), getLastName());
    }
}
