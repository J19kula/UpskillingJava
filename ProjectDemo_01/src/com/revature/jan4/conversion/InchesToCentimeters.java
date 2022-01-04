package com.revature.jan4.conversion;

import java.util.Scanner;

public class InchesToCentimeters {

    public static void main(String args[]){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your inches: ");
        double i = input.nextDouble();

        double centimeters = i * 2.54;
        System.out.print("Your inches in centimeters is: " + centimeters);
    }
}
