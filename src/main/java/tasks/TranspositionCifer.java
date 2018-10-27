package tasks;

import java.util.Scanner;

public class TranspositionCifer {

    public static void main(String[] args) {
        String plainText = getInputText();



        System.out.println();


    }

    private static String getInputText() {
        System.out.println("Podaj tekst do zaszyfrowania: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

}
/* RAFAŁA
    private static String encrypt2(String plainText) {

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < plainText.length()-1; i+=2) {

            result.append(plainText.charAt(i+1));

            result.append(plainText.charAt(i));

        }

        if (plainText.length()%2 != 0){

            result.append(plainText.charAt(plainText.length()-1));

        }

        return result.toString();

    }*/
