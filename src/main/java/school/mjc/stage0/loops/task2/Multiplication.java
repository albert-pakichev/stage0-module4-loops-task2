package school.mjc.stage0.loops.task2;

public class Multiplication {
    public void printMultiplied(int multiplyByAndToInclusive) {
        int factorial = 1;
        int multiplyByAndToInclusive = 7;
        int result = 1;

        if(multiplyByAndToInclusive<1) {
            System.out.println(1);
        }
        else {
            while (factorial <= multiplyByAndToInclusive) {
                factorial++;
                result = result * factorial;
                System.out.println(result);
            }
        }
    }
}
