package com.revature.jan5;

public class Rectangle {
    private double length;
    private double width;

    public Rectangle(){
        length = 2;
        width = 2;
    }

    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }

    public double area(){
        return length * width;
    }

    public double perimeter(){
        return 2*(length + width);
    }

    public double getLength(){
        return length;
    }

    public double getWidth(){
        return width;
    }

    public void setLength(double length){
        this.length = length;
    }

    public void setWidth(double width){
        this.width = width;
    }
}
