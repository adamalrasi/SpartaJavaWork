package com.sparta.aa.basics;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class FilmClassificationTests {

    @Test
    @DisplayName("Check that 1 is equal to 1")
    void demoTest() {
        Assertions.assertEquals(1,1);
    }

    @Test
    @DisplayName("WHEN age is 0, RETURN U, PG")
    void checkThat0ReturnCorrectFilmsRate(){
        int age = 0;
        String expected = "U, PG films are available.";
        String actual = FilmClassification.getClassificationsByAge(age);
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @ValueSource(ints = {0, 1, 10, 11})
    @DisplayName("WHEN using 0, 1, 10, 11, RETURN U, PG")
    void checkCorrectAgesReturnUPG(int age){
        Assertions.assertEquals("U, PG films are available.", FilmClassification.getClassificationsByAge(age));
    }

    @ParameterizedTest
    @ValueSource(ints = {12, 13, 14})
    @DisplayName("WHEN using 12, 13, 14 RETURN U, PG, 12")
    void checkCorrectAgesReturnUPG12(int age){
        Assertions.assertEquals("U, PG, 12 films are available.", FilmClassification.getClassificationsByAge(age));
    }

    @ParameterizedTest
    @ValueSource(ints = {15, 16, 17})
    @DisplayName("WHEN using 15, 16, 17 RETURN U, PG, 12")
    void checkCorrectAgesReturnUPG1215(int age){
        Assertions.assertEquals("U, PG, 12 & 15 films are available.", FilmClassification.getClassificationsByAge(age));
    }

    @ParameterizedTest
    @ValueSource(ints = {18, 19, 30})
    @DisplayName("WHEN using 18+ RETURN U, PG, 12")
    void checkCorrectAgesReturnALL(int age){
        Assertions.assertEquals("All films are available.", FilmClassification.getClassificationsByAge(age));
    }


}
