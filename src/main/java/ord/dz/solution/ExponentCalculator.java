package ord.dz.solution;

public class ExponentCalculator {
    public void getNumberPower(int number, int degree) {
        if (degree < 0) {
            throw new IllegalArgumentException("Multiplication does not occur");
        }
        int result = 1;
        for (; degree !=  0; --degree){
            result *= number;

        }

    }

}
