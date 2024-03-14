package com.sparta.aa.abstractclasses;

import com.sun.security.jgss.GSSUtil;

import java.util.ArrayList;

public class App {
    public static void main(String[] args){
//        Printable customer = new Customer("Adam", "Alrasi");
//        Printable employee = new Employee("Alex", "Blunt");
//        Printable square = new Square(4);
//        Printable circle = new Circle(10);
//
//        ArrayList<Printable> printables = new ArrayList<>();
//        printables.add(customer);
//        printables.add(employee);
//        printables.add(circle);
//        printables.add(square);
//
//        for(Printable printable : printables){
//            printable.print();
//        }

        Customer customer = new Customer("Adam", "Alrasi");
        Customer customer1 = new Customer("Adam", "Alrasi");
        System.out.println(customer.equals(customer1));

        new StringBuilder().reverse();

    }
}