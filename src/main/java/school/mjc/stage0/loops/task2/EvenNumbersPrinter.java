package school.mjc.stage0.loops.task2;

public class EvenNumbersPrinter {
    public void printEvenNumbers(int printTillInclusive) {
        int counter = 0;
        while (printTillInclusive >= counter) {
            System.out.println(counter);
            counter = counter+2;
        }
    }
}
