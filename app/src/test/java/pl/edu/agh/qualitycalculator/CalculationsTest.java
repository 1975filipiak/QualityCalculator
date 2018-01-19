package pl.edu.agh.qualitycalculator;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertTrue;

public class CalculationsTest {
    Calculations calculationsUnderTest;
   // CalculationsVerbalizer calculationsUnderTest2;

    @Before
    public void setUp() {
        calculationsUnderTest = new Calculations();
    //    calculationsUnderTest2 = new CalculationsVerbalizer();
    }

    @Test
    public void testSum() throws Exception {
        assertEquals(5, calculationsUnderTest.calculate(Operation.SUM, 2, 3), 0.01);
    }

    @Test
    public void testMultiply() throws Exception {
        assertEquals(6, calculationsUnderTest.calculate(Operation.MULTIPLY, 2, 3), 0.01);
    }

    @Test
    public void testDivide() throws Exception {
        assertEquals(4, calculationsUnderTest.calculate(Operation.DIVIDE, 20, 5), 0.01);
    }

    @Test
    public void testSubtract() throws Exception {
        assertEquals(6, calculationsUnderTest.calculate(Operation.SUBTRACT, 9, 3), 0.01);
    }

    @Test
    public void testAverage() throws Exception {
        assertEquals(5, calculationsUnderTest.calculate2(Operation.AVERAGE, 5, 5, 5), 0.01);
    }
/*
    @Test
    public void testError() throws Exception {
        assertEquals(" gives value",calculationsUnderTest2.verbalize());
    }
*/
    @After
    public void tearDown() {
    }
}
