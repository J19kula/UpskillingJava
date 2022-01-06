package com.revature.jan5;

import java.util.Scanner;

public class PrintingNumbers {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a whole number greater than 1: ");
        int num = input.nextInt();

        for(int i = 1; i <num+1; i++){
            System.out.print(i);
            if(i % 2 == 0){
                System.out.print(" Even");
            } else{
                System.out.print(" Odd");
            }
            System.out.println();
        }
    }
}
