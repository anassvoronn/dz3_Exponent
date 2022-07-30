package ord.dz.solution;

import org.junit.Assert;
import org.junit.Test;

public class ExponentCalculatorTest {

    @Test
    public void getNumber5Power2() {
        ExponentCalculator calculator = new ExponentCalculator();
        int result = calculator.getNumberPower(5, 2);
        Assert.assertEquals(25, result);
    }

    @Test
    public void getNumber7Power0() {
        ExponentCalculator calculator = new ExponentCalculator();
        int result = calculator.getNumberPower(7, 0);
        Assert.assertEquals(1, result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void getNumber15PowerMinus3() {
        ExponentCalculator calculator = new ExponentCalculator();
        int result = calculator.getNumberPower(15, -3);
        System.out.println(result);
    }

    @Test
    public void getNumber8Power7() {
        ExponentCalculator calculator = new ExponentCalculator();
        int result = calculator.getNumberPower(8, 7);
        int expectedResult = (int) Math.pow(8, 7);
        Assert.assertEquals(expectedResult, result);
    }
}