package com.revature.jan6.calculus;

public class main3 {
    public static void main(String[] args) {
        triangle t1 = new triangle(5, 8);
        rectangle r1 = new rectangle(10, 12);
        polygon p1 = new polygon(12.0, 10.0, 2.0);

        System.out.println("Area of "+t1 + " is "+t1.getArea());
        System.out.println("Area of "+r1+ " is "+r1.getArea());
        System.out.println("Area of "+p1+ " is "+p1.getArea());
    }
}
