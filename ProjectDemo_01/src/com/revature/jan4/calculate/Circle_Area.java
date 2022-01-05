package com.revature.jan4.calculate;

import java.util.Scanner;

public class Circle_Area {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the radius of your Circle, Whole numbers only: ");
        int radius = input.nextInt();

        double sum = (Math.PI) * Math.pow(radius, 2);
        System.out.println("Here is the Area of your Circle: " + sum);

    }

}
