package tasks;

import java.util.Scanner;

public class SumAndAverage_t4 {

    public static void main(String[] args) {
        printAndCalculate();
    }

    private static void printAndCalculate() {
        Scanner scanner = new Scanner(System.in);
        int inputNumber;
        double counter = 0;
        double sum = 0;

        double average;
        while (true) {
            System.out.println("give me a nr");
            inputNumber = scanner.nextInt();
            if (inputNumber != 0) {
                sum += inputNumber;
                counter++;
            } else {
                average = sum / counter;
                System.out.println("Sum = " + sum);
                System.out.println("Mean = " + average);
                return;
            }
        }
    }
}
