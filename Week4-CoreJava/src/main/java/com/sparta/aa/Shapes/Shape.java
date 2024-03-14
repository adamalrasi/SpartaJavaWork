package com.sparta.aa.Shapes;

public abstract class Shape {
    public abstract double calculateArea();

    public String toString(){
        return "This shape has an area of " + calculateArea();
    }
}
