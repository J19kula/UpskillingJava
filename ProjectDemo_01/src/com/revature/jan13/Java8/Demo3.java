package com.revature.jan13.Java8;

public class Demo3 {
    // Applicable only when we need a single object of anonymous class
    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Inside of child");
            }
        };
        Thread t1 = new Thread(runnable);
        t1.start();
        System.out.println("Inside of main");
    }
}
