package school.mjc.stage0.loops.task2;

/**
 * Write a program that will write to console all numbers from factorial row,
 * from 0 up to input from method arguments using while loop, each on new line:
 */
public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {
        int i = 1;
        int prev = 1;
        while (i <= printToInclusive + 1) {
            System.out.println(prev);
            prev = prev * i;
            i++;
        }

    }
}
