package com.sparta.aa.Shapes;

public class Circle extends Shape {
    private final double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    @Override
    public double calculateArea(){
        double radius = 0;
        Circle circle = new Circle(radius);
        return (Math.PI * radius * radius);
    }

}
