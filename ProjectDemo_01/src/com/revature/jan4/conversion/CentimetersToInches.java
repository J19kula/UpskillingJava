package com.revature.jan4.conversion;

import java.util.Scanner;

public class CentimetersToInches {

    public static void main(String args[]){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your centimeters: ");
        double c = input.nextDouble();

        double inches = c / 2.54;
        System.out.print("Your inches in centimeters is: " + inches);
    }
}
