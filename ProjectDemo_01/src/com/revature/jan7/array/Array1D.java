package com.revature.jan7.array;

import java.util.Scanner;

public class Array1D {
    public static void main(String[] args) {
        int[] arr;
        Scanner input = new Scanner(System.in);
        System.out.print("How many elements will you enter: ");
        int size = input.nextInt();
        arr = new int[size];
        int sum = 0;
        int max = 0;
        int min = 0;
        for (int i = 0; i<arr.length; i++){
            System.out.print("Enter element: ");
            arr[i] = input.nextInt();
        }

        System.out.println("Elements you have entered: ");
        for (int i = 0; i<arr.length; i++){
            max = arr[0];
            for (int j = 1; j < arr.length; j++){
                if(arr[j] > max){
                    max = arr[j];
                }
            }
            min = arr[0];
            for (int j = 1; j<arr.length;j++){
                if(arr[j] < min){
                    min = arr[j];
                }
            }
            sum+=arr[i];
            System.out.println(arr[i]);
        }

        System.out.println("The sum is: "+sum);
        System.out.println("The max is: "+max);
        System.out.println("The min is: "+min);
    }
}
