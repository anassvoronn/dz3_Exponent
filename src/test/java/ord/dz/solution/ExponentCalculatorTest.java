package ord.dz.solution;

import org.junit.Test;

import static org.junit.Assert.*;

public class ExponentCalculatorTest {

    @Test
    public void getNumberPower5() {
        ExponentCalculator calculator = new ExponentCalculator();
        calculator.getNumberPower(5, 2);
    }

    @Test
    public void getNumberPower7() {
        ExponentCalculator calculator = new ExponentCalculator();
        calculator.getNumberPower(7, 0);
    }

    @Test (expected = IllegalArgumentException.class)
    public void getNumberPower15() {
        ExponentCalculator calculator = new ExponentCalculator();
        calculator.getNumberPower(15,-3 );
    }

}