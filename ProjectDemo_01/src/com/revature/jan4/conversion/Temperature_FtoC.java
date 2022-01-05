package com.revature.jan4.conversion;

import java.util.Scanner;

public class Temperature_FtoC {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your temperature in Fahrenheit: ");
        double f = input.nextDouble();

        double celsius = (f - 32) * (5.0/9.0);
        System.out.print("Your Temperature in Celsius is: " + celsius);
    }
}
