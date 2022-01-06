package com.revature.jan6.calculus;

public class triangle extends polygon{
    public triangle(){
        super();
    }

    public triangle(double d1, double d2){
        super(d1, d2);
    }

    public double getArea(){
        return (dim1*dim2) /2;
    }

    public String toString(){
        return "Triangle [dim1: "+ dim1 + ", dim2: " + dim2 + "]";
    }
}
