package com.revature.conversion;

import java.util.Scanner;

public class Temperature_CtoF {

    public static void main(String args[]){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your temperature in Celsius: ");
        double c = input.nextDouble();

        double celsius = (c * (9.0/5.0)) + 32;
        System.out.print("Your Temperature in Fahrenheit is: " + celsius);
    }
}
