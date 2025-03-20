package Probeklausur.Aufgabe_013;

import java.util.ArrayList;
import java.util.Arrays;

public class Aufgabe_013 {
    public static void main(String[] args) {
        int[] x = {1, 5, 2};
        int[] y = {1, 1, 5, 2, 9};

        System.out.println(enthaeltSignal(x, y));

        int[] x2 = {1, 2, 5};
        int[] y2 = {3, 1, 3, 7, 3, 7, 4, 8, 3};
        System.out.println(enthaeltSignal(x2, y2));

    }

    public static boolean enthaeltSignal(int[] x, int[] y) {
        ArrayList<Integer> list1 = new ArrayList<>();
        for (int i = 0; i < x.length; i++) {
            list1.add(x[i]);
        }
        ArrayList<Integer> list2 = new ArrayList<>();
        for (int i = 0; i < y.length; i++) {
            list2.add(y[i]);
        }

        return list2.containsAll(list1);
    }
}
