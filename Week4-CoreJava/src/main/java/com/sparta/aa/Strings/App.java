package com.sparta.aa.Strings;

public class App {
    public static void main(String[] args) {
        String name = "Adam";
        String name1 = "Adam";
        String name2 = new String("Adam");
        String name3 = new String("Adam");

        System.out.println(name.hashCode());
        System.out.println(name1.hashCode());
        System.out.println(name2.hashCode());
        System.out.println(name3.hashCode());

        System.out.println(System.identityHashCode(name));


    }
}
