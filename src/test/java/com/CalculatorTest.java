package com;

import com.Calculator;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

/**
 * Created by pardus on 12/22/16.
 */
public class CalculatorTest {

    @Mock
   private Calculator calculator;

    @Before
    public void setup(){
        calculator= new Calculator();
    }

    @Test
    public void testAbs()
    {

        int expected=4;
        int actual=calculator.abs(-4);

        Assert.assertEquals(expected,actual);

    }

}
