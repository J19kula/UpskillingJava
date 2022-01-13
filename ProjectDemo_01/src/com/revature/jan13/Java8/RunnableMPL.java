package com.revature.jan13.Java8;

public class RunnableMPL implements Runnable{
    @Override
    public void run(){
        System.out.println("Inside of Thread");
        for (int i = 0; i < 10; i++){
            try {
                Thread.sleep(700);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("in main: "+i);
        }
        System.out.println("End of main");
    }
}
