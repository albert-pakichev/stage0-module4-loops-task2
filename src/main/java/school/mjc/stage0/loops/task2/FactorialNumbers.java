package school.mjc.stage0.loops.task2;
import java.math.BigInteger;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {
    int factorial = 1;
    BigInteger result = BigInteger.ONE;
        while(factorial<printToInclusive) {
            int i = factorial++;
            result = result.multiply(BigInteger.valueOf(i));
            System.out.println(result);
        }
    }
}
