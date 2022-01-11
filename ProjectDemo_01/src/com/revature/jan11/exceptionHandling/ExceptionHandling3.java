package com.revature.jan11.exceptionHandling;

import java.util.Scanner;

public class ExceptionHandling3 {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        System.out.print("Enter first Number: ");
        int a  = input.nextInt();
        System.out.print("Enter Second number: ");
        int b = input.nextInt();
        try{
            int c = calc(a, b);
            System.out.println("Result: "+ c);
        }
        catch (ArithmeticException e){
            System.out.println("Not possible to calculate: "+ e.getMessage());
        }
        System.out.println("Thank you!!");
    }

    public static int calc(int a, int b){
        int res;
        try{
            res = a/b;
            return res;
        }
        finally {
            System.out.println("End of the calculation");
        }
    }
}
