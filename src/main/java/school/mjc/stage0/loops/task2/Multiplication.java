package school.mjc.stage0.loops.task2;

/**
 * Write a program that will write to console multiplied numbers by input from zero to the
 * number from method arguments using while loop, each on new line(program should also be able to work with negatives):
 */
public class Multiplication {
    public void printMultiplied(int multiplyByAndToInclusive) {
        int i = 0;
        if (multiplyByAndToInclusive == 0) {
            return;
        }
        int mult = multiplyByAndToInclusive;
        if (multiplyByAndToInclusive < 0) {
            mult = - mult;
        }
        while (i <= mult) {
            System.out.println(i * multiplyByAndToInclusive);
            i++;
        }
    }
}
