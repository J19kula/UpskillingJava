package com.revature.jan11.exceptionHandling;

import java.util.Scanner;

public class Uncaught1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first Number: ");
        int a = input.nextInt();
        System.out.print("Enter Second Number: ");
        int b = input.nextInt();
        int c = a/b;
        System.out.println("Result: "+c);
        System.out.println("Thank you!!");
    }
}
