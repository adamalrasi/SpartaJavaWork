package com.sparta.aa.uml;

import com.sparta.aa.testfirstdevelopment.Methods;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class PersonTests {

    @Test
    @DisplayName("Given valid name, getDetails returns details")
    public void givenAnValidFullName_ReturnsAString() {
        String expected = "First Name: Adam , Last Name: Alrasi";
        Person actual = new Person("Adam", "Alrasi");
        Assertions.assertEquals(expected, actual.getDetails());
    }
}
