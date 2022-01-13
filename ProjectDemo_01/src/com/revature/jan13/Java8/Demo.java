package com.revature.jan13.Java8;

public class Demo {
    public static void main(String[] args) {
        Thread t1 = new Thread(new RunnableMPL());
        t1.start();
        System.out.println("Inside of main after thread started execution");
    }
}
