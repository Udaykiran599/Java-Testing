package org.example;
import org.junit.jupiter.api.Test;

import static junit.framework.Assert.assertEquals;

public class CalculatorTest {
    @org.testng.annotations.Test
    void testAddPositiveNumbers(){
        Calculator calculator=new Calculator();
        assertEquals(10, calculator.add(5,5));
    }
}