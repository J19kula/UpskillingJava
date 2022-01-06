package com.revature.jan6.calculus;

public class rectangle extends polygon{
    public rectangle(){
        super();
    }

    public rectangle(double d1, double d2){
        super(d1, d2);
    }

    public double getArea(){
        return dim1 * dim2;
    }

    public String toString(){
        return "Rectangle [dim1: "+ dim1 + ", dim2: " + dim2 + "]";
    }
}
