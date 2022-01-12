package com.revature.jan12.UnitTestingDemo;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;
@RunWith(Parameterized.class)
public class CalculatorSubtractTestWithParams {

    int num1;
    int num2;
    int sum;
    Calculator calculator;

    @Before
    public void init(){
        calculator = new Calculator();
    }

    public CalculatorSubtractTestWithParams(Integer num1, Integer num2, Integer sum){
        this.num1 = num1;
        this.num2 = num2;
        this.sum = sum;
    }


    @Parameterized.Parameters
    public static Collection values(){
        return Arrays.asList(new Object[][]{
                {10, 3, 7},
                {8, 6, 2},
                {12, 4, 8},
                {10, 9, 1}
        });
    }

    @Test
    public void subtract() {
        assertEquals(sum, calculator.subtract(num1, num2));
    }
}