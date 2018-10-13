package tasks;

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {

        int n;
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę.");
        n = scanner.nextInt();
        
        int result = calculate(n);
        System.out.println(n + "! = " + result);
    }

    private static int calculate(int i) {
        if (i <= 1)
            return 1;

        return i * calculate(i - 1);
    }
}

