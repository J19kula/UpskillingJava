package com.revature;

import com.revature.jan5.Calculator;
import com.revature.jan5.Rectangle;

public class Main {

    public static void main(String[] args) {
       /* Calculator calc =  new Calculator();
        calc.setNum1(5);
        calc.setNum2(10);

        Calculator.brand = "Canon";

        Calculator cal2 = new Calculator();
        cal2.setNum1(6);
        cal2.setNum2(30);

        int s1 = calc.add();
        int s2 = cal2.add();

        System.out.println("Sum given by calculator1 with "+calc.getNum1()+" and "+ calc.getNum2()+": " +s1 + " and the brand is " + Calculator.brand);
        System.out.println("Sum given by calculator2 with "+cal2.getNum1()+" and "+ cal2.getNum2()+": " +s2 + " and the brand is " + Calculator.brand);*/

        Rectangle rect = new Rectangle();
        rect.setLength(10);
        rect.setWidth(12);

        double area = rect.area();
        double perimeter = rect.perimeter();

        System.out.println("The area for the rectangle of length: " + rect.getLength() + ", and width: " + rect.getWidth() + ", is: " + area);
        System.out.println("The perimeter for the rectangle of length: " + rect.getLength() + ", and width: " + rect.getWidth() + ", is: " + perimeter);
    }

}
