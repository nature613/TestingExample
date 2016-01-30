package com.fasteque.testingexample;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by danielealtomare on 30/01/16.
 * Project: TestingExample
 */
public class CalculatorTest {
    private Calculator calculator;

    @Before
    public void setUp() throws Exception {
        calculator = new Calculator();
    }

    @After
    public void tearDown() throws Exception {
        // nothing to do.
    }

    @Test
    public void testSum() throws Exception {
        assertEquals(6d, calculator.sum(1d, 5d), 0);
    }

    @Test
    public void testSubtract() throws Exception {
        assertEquals(1d, calculator.subtract(5d, 4d), 0);
    }

    @Test
    public void testDivide() throws Exception {
        assertEquals(4d, calculator.divide(20d, 5d), 0);
    }

    @Test
    public void testMultiply() throws Exception {
        assertEquals(10d, calculator.multiply(2d, 5d), 0);
    }
}