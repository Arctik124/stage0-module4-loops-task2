package school.mjc.stage0.loops.task2;

/**
 * Write a program that will write to console even numbers from zero to the
 * number from method arguments using while loop, each on new line:
 */

public class EvenNumbersPrinter {
    public void printEvenNumbers(int printTillInclusive) {
        int i = 1;
        while (i <= printTillInclusive) {
            if (i % 2 == 0)
                System.out.println(i);
            i++;
        }
    }
}
