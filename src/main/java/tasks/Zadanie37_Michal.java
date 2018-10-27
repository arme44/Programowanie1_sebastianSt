package tasks;

import java.util.ArrayList;

public class Zadanie37_Michal {

    public static void main(String[] args) {

        ArrayList list = new ArrayList();

        String text = "ala1ala ma kota, ala, ala";

        String pattern = "ala";

        if (text.contains(pattern)) {

            for (int i = 0; i < text.length(); i++) {

                int index = text.indexOf(pattern, i);

                if (index == -1) break;

                ArrayList ar = new ArrayList();

                ar.add(index);

                ar.add(index+pattern.length());

                list.add(ar);

                i += index;

            }

        }

        System.out.println(list);

    }
}
