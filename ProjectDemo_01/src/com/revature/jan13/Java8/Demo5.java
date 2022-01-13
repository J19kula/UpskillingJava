package com.revature.jan13.Java8;

public class Demo5 {
    public static void main(String[] args) {
        // have to use () if there is 0 or more than 1 argument
        MyFunctionalINterface myFunctionalINterface = (a) -> System.out.println("The argument is "+a); // Calling println method
        // dont have to use () with only 1 argument
        MyFunctionalINterface myFunctionalINterface1 = a -> System.out.println("This time arg is "+a); // Calling println method
        MyFunctionalINterface myFunctionalINterface2 = System.out::println; // Assigning method reference to functional interface
        myFunctionalINterface.method(10);
        myFunctionalINterface1.method(15);
        myFunctionalINterface2.method(20);
    }
}
