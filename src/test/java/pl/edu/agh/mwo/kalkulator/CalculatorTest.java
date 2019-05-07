package pl.edu.agh.mwo.kalkulator;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import pl.edu.agh.mwo.kalkulator.*;

import junit.framework.Assert;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class CalculatorTest {
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    @Test
    public void sumTest()
    {
        Calculator calc = new Calculator();
        assertEquals(5,calc.add(3,2));
    }

    @Test
    public void subtractTest()
    {
        Calculator calc = new Calculator();
        assertEquals(1,calc.subtract(3,2));
    }

    @Test
    public void divideTest()
    {
        Calculator calc = new Calculator();
        assertEquals(5,calc.divide(10,2));
    }
}
