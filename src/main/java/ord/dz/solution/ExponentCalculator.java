package ord.dz.solution;

public class ExponentCalculator {

    public int getNumberPower(final int number, final int degree) {
        if (degree < 0) {
            throw new IllegalArgumentException("Multiplication does not occur");
        }
        int result = 1;
        for (int i = degree; i != 0; --i) {
            result *= number;

        }
        return result;
    }
}
