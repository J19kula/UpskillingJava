package com.revature.jan11.exceptionHandling;

import java.util.Scanner;

public class Ecomm {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the balance in the account: ");
        int a = input.nextInt();
        System.out.print("Enter the price of the product: ");
        int b = input.nextInt();
        try{
            a = placeOrder(a, b);
            System.out.println("Updated balance after placing the order: "+a);
        }
        catch (InsufficientFundException e){
            System.out.println(e.getMessage());
        }
        System.out.println("Thank you for using EComm Application!");
    }

    public static int placeOrder(int balance, int price) throws InsufficientFundException {
        int updatedBal;
        if(balance < price){
            throw new InsufficientFundException("Insufficient fun avaialable: "+balance+", to place order at the cost: "+price);
        }
        updatedBal= balance - price;
        return updatedBal;
    }
}
