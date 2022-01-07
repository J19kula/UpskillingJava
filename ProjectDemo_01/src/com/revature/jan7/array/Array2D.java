package com.revature.jan7.array;

import java.util.Scanner;

public class Array2D {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("How many arrays: ");
        int k = input.nextInt();
        int[][] arr = new int[k][];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("How many elemnets in " + i + " array? ");
            int l = input.nextInt();
            arr[i] = new int[l];
        }

        System.out.println("Enter elements below: ");
        for (int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length; j++){
                arr[i][j] = input.nextInt();
            }
        }

        System.out.println("Multidimensional array looks like:");
        for(int i=0; i < arr.length; i++) {
            for(int j=0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        int sum = 0;
        System.out.println("Sum of all elements: ");
        for(int i=0; i < k; i++) {
            for(int j=0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
        }
        System.out.println(sum);

    }
}
