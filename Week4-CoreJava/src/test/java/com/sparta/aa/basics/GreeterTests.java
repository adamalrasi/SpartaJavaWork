package com.sparta.aa.basics;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

public class GreeterTests {
    @Test
    @DisplayName("Check that 1 is equal to 1")
    void demoTest() {
        Assertions.assertEquals(1,1);
    }

    @Test
    @DisplayName("WHEN time is 5, RETURN good evening")
    void checkThat5ReturnsGoodMorning(){
        int time = 5;
        String expected = "Good morning!";
        String actual = Greeter.getGreeting(time);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    @DisplayName("WHEN time is 12, RETURN good evening")
    void checkThat12ReturnsGoodAfternoon(){
        int time = 12;
        String expected = "Good afternoon!";
        String actual = Greeter.getGreeting(time);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    @DisplayName("WHEN time is 21, RETURN good evening")
    void checkThat21ReturnsGoodEvening(){
        int time = 21;
        String expected = "Good evening!";
        String actual = Greeter.getGreeting(time);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    @DisplayName("WHEN time is a valid Int, RETURN String")
    void checkThatValidIntReturnsAString(){
        int time = 5;
        String expected = "Good evening!";
        String actual = Greeter.getGreeting(time);
        Assertions.assertEquals(expected.getClass().getName(), actual.getClass().getName());
    }

    @ParameterizedTest
    @ValueSource(ints = {12, 18})
    @DisplayName("WHEN using 12 and 18, return Good afternoon")
    void check12And18ReturnsGoodAfternoon(int time){
        Assertions.assertEquals("Good afternoon!", Greeter.getGreeting(time));
    }

    @ParameterizedTest
    @DisplayName("check that the correct greeting is returned")
    @CsvSource({
            "Good evening!, 2",
            "Good morning!, 8",
            "Good afternoon!, 15",
            "Good evening!, 21"
    })
    void checkThatCorrectGreetingIsReturned(String greeting, int time){
        Assertions.assertEquals(greeting, Greeter.getGreeting(time));
    }

}
