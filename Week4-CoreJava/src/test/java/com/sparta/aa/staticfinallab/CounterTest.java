package com.sparta.aa.staticfinallab;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

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
        // Arrange
        int expected = 11;
        Counter actual = new Counter("Test", 10);

        // Act
        actual.increment();

        // Assert
        Assertions.assertEquals(expected, actual.getCount());
    }

    @Test
    @DisplayName("Check if Global Count is working correctly, return Global Count")
    public void checkIfGlobalCountIsWorking(){
        // Arrange
        int expected = 10;
        Counter test1 = new Counter("Test1", 0);
        Counter test2 = new Counter("Test1", 0);

        // Act
        test1.setGlobalCount(10);

        // Assert
        Assertions.assertEquals(expected, test2.getGlobalCount());
    }

}
