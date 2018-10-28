package tasks.sorting;

import java.util.Arrays;

public class SortingByCounting {

    public static void main(String[] args) {
       int limit = 9;
       int[] n = {1,1,4,2,5,7,8,9,1,3,4,6,8,5,2,3,4};
       sort(n, limit);
       //print(n);

    }
    private static void print(int[] numbers) {
        System.out.println(Arrays.toString(numbers));
    }
    private static void sort(int[] n, int limit) {
        int count = 0;

        for (int i = 1; i<= limit; i++) {
            count = 0;
            for (int j = 0; j<n.length; j++){
                if (n[j] == i) {
                    count++;
                    System.out.printf(i + ",");
                }
            }
        }
    }
}
