package com.sparta.aa.uml;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CustomerTests {

    @Test
    @DisplayName("Check valid inputs Return valid String")
    public void givenValidInput_ReturnValidString(){
        String expected = "Delivery Address: Birmingham, First Name: Adam , Last Name: Alrasi";
        Customer actual = new Customer("Adam", "Alrasi", "Birmingham");
        Assertions.assertEquals(expected, actual.getDetails());
    }
}
