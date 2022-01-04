package com.revature.jan4.calculate;

import java.util.Scanner;

public class Triangle_Area {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the base of your triangle, Whole numbers only: ");
        int base = input.nextInt();
        System.out.print("Enter the height of your triangle, Whole numbers only: ");
        int height = input.nextInt();

        double sum = 0.5 * (double) base * (double) height;
        System.out.println("Here is the Area of your triangle: " + sum);

    }
}
