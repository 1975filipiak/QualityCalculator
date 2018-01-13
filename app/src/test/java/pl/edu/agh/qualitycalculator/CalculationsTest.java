package pl.edu.agh.qualitycalculator;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class CalculationsTest {
    Calculations calculationsUnderTest;

    @Before
    public void setUp() {
        calculationsUnderTest = new Calculations();
    }

    @Test
    public void testSum() throws Exception {
        assertEquals(5, calculationsUnderTest.calculate(Operation.SUM, 2, 3), 0.01);
    }

    @Test
    public void mnozenie() throws Exception {
        assertEquals(6, calculationsUnderTest.calculate(Operation.MULTIPLY, 2, 3), 0.01);
    }

    @Test
    public void dzielenie() throws Exception {
        assertEquals(4, calculationsUnderTest.calculate(Operation.DIVIDE, 20, 5), 0.01);
    }

    @Test
    public void odejmowanie() throws Exception {
        assertEquals(6, calculationsUnderTest.calculate(Operation.SUBTRACT, 9, 3), 0.01);
    }

    @Test
    public void dzielenie2() throws Exception {
        assertEquals(2, calculationsUnderTest.calculate(Operation.DIVIDE, 20, 10), 0.01);
    }

    @Test
    public void wyjatek() throws Exception {
        assertEquals(-2, calculationsUnderTest.calculate(Operation.DIVIDE, 20, 10), 0.01);
    }

    @After
    public void tearDown() {
    }
}
