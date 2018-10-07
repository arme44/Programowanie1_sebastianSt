package Tasks;

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {

        int n;
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę.");
        n = scanner.nextInt();
        
        int calculate = factorial(n);
        System.out.println(n + "! = " + calculate);
    }

    private static int factorial(int i) {
        if (i <= 1)
            return 1;
        
        return i * factorial(i - 1);
    }
}

