package com.revature.jan12.UnitTestingDemo;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    Calculator calculator;

    @Before
    public void method(){
        calculator = new Calculator();
    }

    @After
    public void method2(){
        calculator = null;
    }

    @Test
    public void addAndTestEquals() {
        int sum = calculator.add(5,7);
        assertEquals(12, sum);
    }

    @Test
    public void addAndTestNotEquals(){
        int sum = calculator.add(5,7);
        assertNotEquals(1,sum);
    }

    @Test
    public void subtractAndTestEquals() {
        int sum = calculator.subtract(7,5);
        assertEquals(2, sum);
    }

    @Test
    public void subtractAndTestNotEquals(){
        int sum = calculator.subtract(7,5);
        assertNotEquals(3, sum);
    }

    @Test
    public void multiplyAndTestEquals(){
        int sum = calculator.multiply(5,6);
        assertEquals(30, sum);
    }

    @Test
    public void multiplyAndTestNotEquals(){
        int sum = calculator.multiply(5,6);
        assertNotEquals(3, sum);
    }

    @Test
    public void divideAndTestEquals(){
        double sum = calculator.divide(6,2);
        assertEquals(3.0, sum,0.001);
    }

    @Test
    public void divideAndTestNotEquals(){
        double sum = calculator.divide(6,2);
        assertNotEquals(32, sum, 0.001);
    }

    @Test
    public void powerAndTestEquals(){
        double sum = calculator.power(6,2);
        assertEquals(36, sum, 0.001);
    }

    @Test
    public void powerAndTestNotEquals(){
        double sum = calculator.power(6,2);
        assertNotEquals(3, sum, 0.001);
    }
}