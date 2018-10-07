package Tasks;

import java.util.Scanner;

public class SumAndMean_t4 {

    public static void main(String[] args) {
        printAndCalculate();
    }

    private static void printAndCalculate() {
        Scanner scanner = new Scanner(System.in);
        int inputNumber, counter = 0, sum = 0;
        double mean;
        while (true) {
            System.out.println("give me a nr");
            inputNumber = scanner.nextInt();
            if (inputNumber != 0) {
                sum += inputNumber;
                counter++;
            } else {
                mean = sum / counter;
                System.out.println("Sum = " + sum);
                System.out.println("Mean = " + mean);
                return;
            }
        }
    }
}
