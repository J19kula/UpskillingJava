package com.revature.jan11.exceptionHandling;

import java.util.Scanner;

public class UnCaught2 {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        System.out.print("Enter first Number: ");
        int a  = input.nextInt();
        System.out.print("Enter Second number: ");
        int b = input.nextInt();
        int c = calc(a, b);
        System.out.println("Result: "+ c);
    }

    public static int calc(int a, int b){
        int res;
        res = a/b;
        System.out.println("End of the calculation");
        return res;
    }
}
