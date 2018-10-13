package tasks;

import java.util.Scanner;

public class Zadanie35 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("how much money to withdraw");
        double n = scanner.nextDouble();
        System.out.println("Kwota do wypłaty to " + n + " można ją wypłacić w banknotach:");



        if (n >= 500) {
            double fiveHundred = Math.floor(n / 500);
            System.out.println(fiveHundred + " banknotach 500 zł");
            n -= fiveHundred*500;
        } if (n >= 200) {
            double twoHundred = Math.floor(n / 200);
            System.out.println(twoHundred + " banknotach 200 zł");
            n = n - twoHundred*200;
        } if (n >= 100) {
            double oneHundred = Math.floor(n / 100);
            System.out.println(oneHundred + " banknotach 100 zł");
            n = n - oneHundred*100;
        } if (n >= 50) {
            double fifty = Math.floor(n / 50);
            System.out.println(fifty + " banknotach 50 zł");
            n = n - fifty*50;
        } if (n >= 20) {
            double twenty = Math.floor(n / 20);
            System.out.println(twenty + " banknotach 20 zł");
            n = n - twenty*20;
        } if (n >= 10) {
            double ten = Math.floor(n / 10);
            System.out.println(ten + " banknotach 10 zł");
            n = n - ten * 10;
        } if (n >= 5) {
            double five = Math.floor(n / 5);
            System.out.println(five + " monetach 5 zł");
            n = n - five * 5;
        } if (n >= 2) {
            double two = Math.floor(n / 2);
            System.out.println(two + " monetach 2 zł");
            n = n - two * 2;
        } if (n >= 1) {
            double one = Math.floor(n / 1);
            System.out.println(one + " monetach 1 zł");
            n = n - one * 1;
        } if (n >= 0.5) {
            double pgr = Math.floor(n / 0.5);
            System.out.println(pgr + " monetach 50 gr");
            n = n - pgr * 0.5;
        } if (n >= 0.2) {
            double ddgr = Math.floor(n / 0.2);
            System.out.println(ddgr + " monetach 20 gr");
            n = n - ddgr * 0.2;
        } if (n >= 0.1) {
            double dzgr = Math.floor(n / 0.1);
            System.out.println(dzgr + " monetach 10 gr");
            n = n - dzgr * 0.1;
        } if (n >= 0.05) {
            double pgr = Math.floor(n / 0.05);
            System.out.println(pgr + " monetach 5 gr");
            n = n - pgr * 0.05;
        } if (n >= 0.02) {
            double dwgr = Math.floor(n / 0.02);
            System.out.println(dwgr + " monetach 2 gr");
            n = n - dwgr * 0.02;
        } if (n >= 0.01) {
            double gr = Math.floor(n / 0.01);
            System.out.println(gr + " monetach 1 gr");
            n = n - gr * 0.01;
        }

    }


}
