package com.sparta.aa.testfirstdevelopment;

public class Methods {

    // implement this method so that it returns true if x is greater than or equal to y
    public static boolean greaterEqual(int x, int y) {
        return x >= y;
    }

    // implement this method so that it take an int as an input,
    // squares it, adds 101, divides the result by 7, then subtracts 4.
    // return a double.
    public static double BODMAS(int inputNumber) {
        return ((double) (inputNumber * inputNumber + 101) / 7 - 4);
    }


    // implement this method so that it returns true if input is "password"
    // regardless of case
    public static boolean checkInput(String input) {
        return "password".equalsIgnoreCase(input);
    }

    // implement this method so that it returns the sum of all the numbers from start to end
    public static int sumNums(int start, int end ) {
        int sum = 0;
        while (start<=end){
            sum = sum + start;
            start++;
        }
        return sum;
    }

    // implement this method so that it returns the sum
    // of all the numbers in the array nums
    public static int sumArray(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        return sum;
    }
}
