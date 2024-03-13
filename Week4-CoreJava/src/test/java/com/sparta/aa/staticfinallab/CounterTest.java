package com.sparta.aa.staticfinallab;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CounterTest {

    @Test
    @DisplayName("Given valid number, return the expected count")
    public void givenValidCount_ReturnExpectedCount(){
        int expected = 10;
        Counter actual = new Counter("Demo", 10);
        Assertions.assertEquals(expected, actual.getCount());
    }

    @Test
    @DisplayName("Given valid name, return name from getter")
    public void checkIfGetterIsWorking() {
        String expected = "Adam";
        Counter counter = new Counter("Demo", 10);
        counter.setName("Adam");
        Assertions.assertEquals(expected, counter.getName());
    }

    @Test
    @DisplayName("Check if the increment methods works correctly, return count")
    public void checkIfIncrementIsWorking(){
        int expected = 11;
        Counter actual = new Counter("Test", 10);
        actual.increment();
        Assertions.assertEquals(expected, actual.getCount());
    }

}
