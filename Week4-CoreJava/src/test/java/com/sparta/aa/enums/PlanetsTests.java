package com.sparta.aa.enums;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class PlanetsTests {

//    @Test
//    @DisplayName("WHEN age is 0, RETURN U, PG")
//    void checkThat0ReturnCorrectFilmsRate(){
//        int age = 0;
//        String expected = "U, PG films are available.";
//        String actual = FilmClassification.getClassificationsByAge(age);
//        Assertions.assertEquals(expected, actual);
//    }

    @Test
    @DisplayName("Check that Mars's mass is 0.11")
    void checkThatMarsMassIsCorrect(){
        // Arrange
        String expected = "0.11";
        String actual = Planets.MARS.getMass();
        // Act
        // Assert
        Assertions.assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Check that Mar's ordinal is correct")
    void checkThatMarsOrdinalIsCorrect(){
        //Arrange
        int expected = 3;
        int actual = Planets.MARS.ordinal();
        //Act
        //Assert
        Assertions.assertEquals(expected, actual);
    }

}
