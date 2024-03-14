package com.sparta.aa.abstractclasses;

public class Circle extends Shape implements Printable{
    private double radius;
    public Circle(double radius){
        this.radius = radius;
    }

    @Override
    public double calculateArea(){
        Circle circle = new Circle(radius);
        return (Math.PI * radius * radius);
    }

    @Override
    public void doSomethingElse() {
        Printable.super.doSomethingElse();
    }

    @Override
    public void print() {

    }
}
