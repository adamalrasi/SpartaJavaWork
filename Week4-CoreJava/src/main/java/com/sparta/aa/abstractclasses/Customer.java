package com.sparta.aa.abstractclasses;

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

    }
}
