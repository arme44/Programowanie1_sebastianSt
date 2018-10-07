package Tasks;

import java.util.Scanner;

public class FactorialRecursion {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Give number");
        int n = scanner.nextInt();
        System.out.println("Factorial = " + factorial(n));
    }

    private static int factorial(int i) {
        if (i==1) {
            return 1;
        } else {
           return i * factorial(i - 1);
        }
    }
}
