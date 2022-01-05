package com.revature.jan4.calculate;

import java.util.Scanner;

public class Triangle_Perimeter {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter the base of your triangle, Whole numbers only: ");
    int base = input.nextInt();
    System.out.print("Enter the first side of your triangle, Whole numbers only: ");
    int side = input.nextInt();
    System.out.print("Enter the second side of your triangle, Whole numbers only: ");
    int side1 = input.nextInt();

    int sum = base + side + side1;
    System.out.println("Here is the Perimeter of your triangle: " + sum);
    }
}
