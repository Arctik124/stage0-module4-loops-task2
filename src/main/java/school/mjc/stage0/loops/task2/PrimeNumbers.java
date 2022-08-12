package school.mjc.stage0.loops.task2;

/**
 * Write a program that will write to console all simple numbers from 0
 * up to input from method arguments using while loop, each on new line:
 */
public class PrimeNumbers {
    public void printPrimeNumbers(int printToInclusive) {
        int i = 2;
        boolean isPrime;
        int j;
        while (i <= printToInclusive) {
            isPrime = true;
            j = 2;
            while (j <= i / 2) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
                j++;
            }
            if (isPrime)
                System.out.println(i);
            i++;
        }
    }
}
