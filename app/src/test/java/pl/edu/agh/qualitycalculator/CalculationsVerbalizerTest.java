package pl.edu.agh.qualitycalculator;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertTrue;

/**
 * Created by a on 2018-01-19.
 */

public class CalculationsVerbalizerTest {

    CalculationsVerbalizer calculationsverbalizerUnderTest;

    @Before
    public void setUp() {
        calculationsverbalizerUnderTest = new CalculationsVerbalizer();
    }
/*
@Test
    public void testSum() throws Exception {
        assertEquals(5, calculationsUnderTest.calculate(Operation.SUM, 2, 3), 0.01);
    }
 */
    @Test
    public void testVerbalizeSum() throws Exception {
      //  assertTrue("5.0 plus 4.0 gives 9.0", calculationsverbalizerUnderTest.verbalize(Operation.Verbalize1, 5, 4));
      String result = "5.0 plus 5.0 gives value 10.0";
      String verbalizedOperation = calculationsverbalizerUnderTest.verbalize(Operation.SUM, 5, 5, 10);
      assertEquals(result,verbalizedOperation);
    }
    @Test
    public void testVerbalizeSubtract() throws Exception {
        //  assertTrue("5.0 plus 4.0 gives 9.0", calculationsverbalizerUnderTest.verbalize(Operation.Verbalize1, 5, 4));
        String result = "5.0 minus 5.0 gives value 0.0";
        String verbalizedOperation = calculationsverbalizerUnderTest.verbalize(Operation.SUBTRACT, 5, 5, 0);
        assertEquals(result,verbalizedOperation);
    }
    @Test
    public void testVerbalizeDivide() throws Exception {
        //  assertTrue("5.0 plus 4.0 gives 9.0", calculationsverbalizerUnderTest.verbalize(Operation.Verbalize1, 5, 4));
        String result = "5.0 divided by 5.0 gives value 1.0";
        String verbalizedOperation = calculationsverbalizerUnderTest.verbalize(Operation.DIVIDE, 5, 5, 1);
        assertEquals(result,verbalizedOperation);
    }
    @Test
    public void testVerbalizeMultiply() throws Exception {
        //  assertTrue("5.0 plus 4.0 gives 9.0", calculationsverbalizerUnderTest.verbalize(Operation.Verbalize1, 5, 4));
        String result = "5.0 multiplied by 5.0 gives value 25.0";
        String verbalizedOperation = calculationsverbalizerUnderTest.verbalize(Operation.MULTIPLY, 5, 5, 25);
        assertEquals(result,verbalizedOperation);
    }
    @Test
    public void testVerbalizeAverage() throws Exception {
        //  assertTrue("5.0 plus 4.0 gives 9.0", calculationsverbalizerUnderTest.verbalize(Operation.Verbalize1, 5, 4));
        String result = "5.0 average by 5.0 average by 5.0 gives value 5.0";
        String verbalizedOperation = calculationsverbalizerUnderTest.verbalize2(Operation.AVERAGE, 5, 5, 5, 5);
        assertEquals(result,verbalizedOperation);
    }
}
