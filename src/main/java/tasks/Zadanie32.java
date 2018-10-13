package tasks;

import java.util.Scanner;

public class Zadanie32 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Give number");
        int n = scanner.nextInt();
        if (checkInputNumberIsIncorrect(n)) return;

        //drawingFigure1(n);
        //drawingFigure2(n);
        //drawingFigure21(n);
        drawingFigure3(n);
        System.out.println();
        System.out.println();
        drawingFigure4(n);

    }


    private static boolean checkInputNumberIsIncorrect(int n) {

        if (n < 1 || n > 20) {
            System.out.println("Number must be between 1 - 20");
            return true;
        }
        return false;
    }

    private static void drawingFigure1(int n) {

        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void drawingFigure2(int n) {
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= i; j++) {
                if (i==j) {
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    private static void drawingFigure21(int n) {
        for (int i = 0; i <= n; i++) {
            for (int j = n; j > 0; j--) {
                if (i==j)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }

    private static void drawingFigure3(int n) {
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n; j++) {
                if (i == 0 || i == n) {
                    System.out.print("*");
                }else if (j == 0 || j == n){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

// zrobic x-sa ----------------------------------------------------//
    private static void drawingFigure4(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j+i+1== n || j == i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

