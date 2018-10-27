package tasks.testy;

import java.util.Arrays;
import java.util.List;

public class Test {

    public static void main(String[] args) {

        //Zadanie 2. rekurencja - Dla podanego ciągu liczb całkowitych wypisz ten ciąg w odwrotnej kolejności.
        //
        //Ciąg podajemy na sztywno w programie

        List<Integer> chain = Arrays.asList(1, 2, 3, 8, 5, 3, 8);

        getNumber(chain, chain.size());

    }

    public static String getNumber(List<Integer> chain, int i) {
        if (i == 0)
            return "";
        System.out.println(chain.get(i-1));
        return getNumber(chain, i-1);
    }

}
