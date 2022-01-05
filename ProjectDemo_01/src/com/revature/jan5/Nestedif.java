package com.revature.jan5;

import java.util.Scanner;

public class Nestedif {

    public static void main(String args[]){
        Scanner input = new Scanner(System.in);

        //initialize the input values
        System.out.print("Please enter your first number, Whole numbers only: ");
        int first = input.nextInt();
        System.out.print("PLease enter your Second number, Whole numbers only: ");
        int second = input.nextInt();
        System.out.print("Please enter your final number, Whole numbers only: ");
        int third = input.nextInt();

        //check if first is bigger than second
        if(first > second){
            //check if first is bigger than third
            if (first > third){
                System.out.println("Your First number " + first + " is the biggest number!");
            } else {
                System.out.println("Your Third number " + third + " is the biggest number!");
            }
            //check second and third
        } else if(second > third){
            System.out.print("Your Second Number " + second + " is the biggest number!");
        } else{
            System.out.println("Your Third number " + third + " is the biggest number!");
        }
    }
}
