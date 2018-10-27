package tasks;

import java.util.Arrays;
import java.util.List;

public class Test {

    public static void main(String[] args) {

        //Zadanie 2. rekurencja - Dla podanego ciągu liczb całkowitych wypisz ten ciąg w odwrotnej kolejności.
        //
        //Ciąg podajemy na sztywno w programie

        List<Integer> chain = Arrays.asList(1, 2, 3, 8, 5, 3, 8);

        int number = getNumber(chain.size());

    }

    public static int getNumber(int i) {
        List<Integer> chain = Arrays.asList(1, 2, 3, 8, 5, 3, 8);
        if (i <= 0)
            return 1;
        System.out.println(chain.get(i-1) + ",");
        return i * getNumber(i - 1);
    }

}
