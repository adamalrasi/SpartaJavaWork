package com.sparta.aa.enums;

public enum Days {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;

    public static void main(String[] args){
//        Days dayOfTheWeek = Days.FRIDAY;
//        Days tomorrow = Days.SATURDAY;
//        System.out.println(dayOfTheWeek.compareTo(tomorrow));

        System.out.println(Days.valueOf("FRIDAY").ordinal());

    }
}
