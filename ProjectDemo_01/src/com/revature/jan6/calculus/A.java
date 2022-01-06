package com.revature.jan6.calculus;

public class A {
    int x;
    public A(){
        System.out.println("Super class no arg constructor");
    }

    public A(int x){
        this.x = x;
        System.out.println("Super class one arg constructor with: " + x);
    }

}
