package com.revature.jan4.calculate;

import java.util.Scanner;

public class Rectangle_Perimeter {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the length of your rectangle, Whole numbers only: ");
        int length = input.nextInt();
        System.out.print("Enter the width of your rectangle, Whole numbers only: ");
        int width = input.nextInt();

        int sum = 2 * (length + width);
        System.out.println("Here is the Perimeter of your rectangle: " + sum);
    }
}
