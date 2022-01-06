package com.revature.jan5;

public class WhileLoan {
    public static void main(String[] args) {
        int loan = 10000;
        int emi = 1000;
        double interest;
        float rate = 3;
        float time = 10;
        int noemi = 0;
        interest = (loan * rate * time)/100;
        double total =  loan + interest;

        while (loan > 0){
            loan -= emi;
            System.out.println("interest: "+ interest);
            System.out.println("total: " + total);
            noemi ++;
            System.out.println("Paying "+emi+" of the installment "+noemi);
        }
        System.out.println("You are free from the loan after " +noemi+" installments has paid");
    }
}
