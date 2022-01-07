package com.revature.jan7.array;

import java.util.Scanner;

public class ArrayDim1 {
    public static void main(String[] args) {
        int[] marks;
        marks = new int[4];
        Scanner input = new Scanner(System.in);
        System.out.println("How many elements will you enter: ");
        int size = input.nextInt();
        marks = new int[size];
        for (int i = 0; i < marks.length; i++){
            System.out.print("Enter element: ");
            marks[i] = input.nextInt();
        }

        System.out.println("Elements you have entered: ");
        for (int i = 0; i<marks.length; i++){
            System.out.println(marks[i]);
        }

        System.out.println("Thank you");

    }
}
