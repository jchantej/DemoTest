package IWVG.SwC.Chinegua.calculos;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class FractionTest {
    private Fraction pt;

    private Fraction pt2;

    private Fraction pt3;

    @Rule
    public ExpectedException exception = ExpectedException.none();

    @Before
    public void before() {
        pt2 = new Fraction();
        pt = new Fraction(1, 2);
        pt3 = new Fraction(3, 2);
    }

    @Test
    public void testFractionIntInt() {
        assertEquals(1, pt.getNumerator());
        assertEquals(2, pt.getDenominator());
    }

    @Test
    public void testFraction() {
        assertEquals(1, pt2.getNumerator());
        assertEquals(1, pt2.getDenominator());
    }

    @Test
    public void testDecimal() {
        assertEquals(0.5, pt.decimal(), 0.5);
    }

    @Test
    public void testLargerNumerator() {
        assertEquals(false, pt.largerNumerator());
        assertEquals(true, pt3.largerNumerator());
    }

    @Test
    public void testMultiplicar() {
        pt = new Fraction(1, 1);
        pt2 = new Fraction(1, 2);
        assertEquals(0.5, pt.multiplyFraction(pt, pt2), 0.5);
    }

    @Test
    public void testDivisionByZero() {
        pt = new Fraction(1, 2);
        pt2 = new Fraction(1, 0);
        exception.expect(ArithmeticException.class);
        assertEquals(0.5, pt.multiplyFraction(pt, pt2), 0.5);
    }

    @Test
    public void testObjectNull() {
        pt = new Fraction(1, 1);
        exception.expect(RuntimeException.class);
        pt2 = null;
  
        assertEquals(0.5, pt.multiplyFraction(pt, pt2), 0.5);
    }
    
    @Test
    public void testObjectNullNull()  {
        pt = null;
        pt2 = null;
        exception.expect(NullPointerException.class);
        assertEquals(0.5, pt.multiplyFraction(pt, pt2), 0.5);
    }


    @Test
    public void testAddFraction() {
        Fraction f = pt.addFraction(pt3);
        assertEquals(8, f.getNumerator());
        assertEquals(4, f.getDenominator());
    }

}
