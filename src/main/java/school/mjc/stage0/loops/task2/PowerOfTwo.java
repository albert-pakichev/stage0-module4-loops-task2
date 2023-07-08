package school.mjc.stage0.loops.task2;

public class PowerOfTwo {
    public void printPower(int power) {
        int base = 2;
        int result = 1;
        if(power>=0) {
            while (power != 0) {
                result *= base;
                power--;
            }
            System.out.println(result);
        }
        else {
            System.out.println("too much power");
        }
    }
}
