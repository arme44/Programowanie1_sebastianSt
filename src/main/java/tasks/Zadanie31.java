package tasks;

import java.util.Scanner;

public class Zadanie31 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Give n");
        int n = scanner.nextInt();
        if (checkInputNumbersIsIncorrect(n)) return;

        printNumberSequence1(n);
        System.out.println();
        System.out.println("----------------------------------");
        printNumberSequence2(n);
        System.out.println();
        System.out.println("----------------------------------");
        printNumberSequence3(n);
        System.out.println();
        System.out.println("----------------------------------");
        printNumberSequence4(n);


    }


    private static boolean checkInputNumbersIsIncorrect(int n) {

        if (n < 1 || n > 20) {
            System.out.println("n must be between 1 - 20");
            return true;
        }
        return false;
    }


    private static void printNumberSequence1(int n) {

        for (int i = 1; i <= n; i++) {
            System.out.print(i * 2 - 1 + " ");
        }
    }
/*    IntStream.range(1, n+1).forEach(
            t ->
    )*/


    private static void printNumberSequence2(int n) {

        for (int i = 1, k = -1, j = 1; i <= n; k += j, i++) {
            j *= 2;
            System.out.print(k + " ");
        }
    }


    private static void printNumberSequence3(int n) {

        for (int i = 1, result = 2, k = 1; i <= n; i++, result += 2 * k) {
            if (result == 8) {
                k = -1;
            } else if (result == 2) {
                k = 1;
            }
            System.out.print(result + " ");
        }
    }

    private static void printNumberSequence4(int n) {
        if (n == 0) {
            System.out.println("there is no 0");
        } else if (n == 1) {
            System.out.println("1");
        } else {
            for (int i = 2, a = 1, b = 0; i <= n; i++) {
                int result = a + b;
                System.out.print(result + " ");
                a = b;
                b = result;
            }
        }
    }

}



