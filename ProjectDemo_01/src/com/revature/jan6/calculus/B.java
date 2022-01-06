package com.revature.jan6.calculus;

public class B extends A{
    public B(){
        System.out.println("Sub class no arg constructor");
    }

    public B(int arg){
        super(arg);
        System.out.println("Sub class one arg constructor with: "+arg);
    }
}
