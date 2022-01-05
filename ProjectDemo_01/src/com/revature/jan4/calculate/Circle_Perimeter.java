package com.revature.jan4.calculate;

import java.util.Scanner;

public class Circle_Perimeter {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the radius of your Circle, Whole numbers only: ");
        int radius = input.nextInt();

        double sum = 2 * (Math.PI) * radius;
        System.out.println("Here is the perimeter of your Circle: " + sum);

    }
}
