package com.revature.jan13.Java8;

public class Demo4 {
    // Removed all code noise
    public static void main(String[] args) {
        // Lambda expression
        Runnable runnable = () -> {
                System.out.println("Inside of child");
        };
        Thread t1 = new Thread(runnable);
        t1.start();
        System.out.println("Inside of main");
    }
    }

