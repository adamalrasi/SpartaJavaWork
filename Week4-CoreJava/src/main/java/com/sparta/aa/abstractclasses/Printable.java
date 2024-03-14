package com.sparta.aa.abstractclasses;

public interface Printable {
//    public void print(); // methods always public & abstract
    public static final int score = 0; // constants

    static void doSomething(){

    }

    default void doSomethingElse() {
        System.out.println("Hello");
    }

    void print();
}


