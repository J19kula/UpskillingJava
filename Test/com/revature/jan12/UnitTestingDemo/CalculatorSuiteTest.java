package com.revature.jan12.UnitTestingDemo;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import static org.junit.Assert.*;

@RunWith(Suite.class)
@Suite.SuiteClasses({CalculatorAddTestWithParams.class, CalculatorTest.class, CalculatorSubtractTestWithParams.class})
public class CalculatorSuiteTest {

}