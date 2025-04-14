package com.poly;


import com.poly.calculator;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculatorTest {
    @Test
    public void testAdd() {
        calculator calculator = new calculator();
        Assert.assertEquals(calculator.add(2, 3), 5);
    }

    @Test
    public void testSubtract() {
    	calculator calculator = new calculator();
        Assert.assertEquals(calculator.subtract(5, 3), 2);
    }
}
