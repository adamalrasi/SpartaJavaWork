package com.sparta.aa.staticfinallab;

import java.util.Objects;
import java.util.Random;

public class Counter {
    private String name;
    private int count;
    public static int globalCount;
    public static final int CAPACITY;

    static {
        CAPACITY = new Random().nextInt(30, 120);
    }

    public Counter(String name, int count){
        this.name = name;
        this.count = count;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public static int getGlobalCount() {
        return globalCount;
    }

    public static void setGlobalCount(int globalCount) {
        Counter.globalCount = globalCount;
    }

    public void increment() {
        this.count++;
    }
}
