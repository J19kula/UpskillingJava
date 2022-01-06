package com.revature;

import com.revature.jan6.inheritance.SimpleInheritence;
import com.revature.jan6.inheritance.SimpleInheritence2;

public class Main2 {
    public static void main(String[] args) {
        System.out.println("Hello world");
        SimpleInheritence a = new SimpleInheritence();
        SimpleInheritence2 b = new SimpleInheritence2();

        System.out.println("with an instance of super class");
        a.method1();

        System.out.println("with an instance of sub class");
        b.method2();
    }
}
