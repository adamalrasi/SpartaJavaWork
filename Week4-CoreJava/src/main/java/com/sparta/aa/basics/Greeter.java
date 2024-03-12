package com.sparta.aa.basics;
/*
1. Read
2. Maintain
3. Test
 */

public class Greeter {
    public static void main(String[] args){ // entry point
        int timeOfDay = 10;
        System.out.println(getGreeting(timeOfDay));
    }
    public static String getGreeting(int timeOfDay) {
        if (timeOfDay >= 5 && timeOfDay < 12) {
            return "Good morning!";
        } else if (timeOfDay >= 12 && timeOfDay <= 18) {
            return "Good afternoon!";
        } else {
            return "Good evening!";
        }
    }
}
