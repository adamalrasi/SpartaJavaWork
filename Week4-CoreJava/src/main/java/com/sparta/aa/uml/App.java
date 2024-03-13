package com.sparta.aa.uml;

public class App {
    public static void main(String[] args){
        Person person = new Person("Adam", "Alrasi");
        System.out.println(person.getDetails());

        Customer customer = new Customer("Adam", "Alrasi", "Birmingham");
        System.out.println(customer.getDetails());

    }
}
