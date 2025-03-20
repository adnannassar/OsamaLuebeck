package Probeklausur.Aufgabe_014;

public class Aufgabe_014 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        print(aufNullZiehen(array));
    }


    public static int[] aufNullZiehen(int[] x) {
        int min = x[0];
        int index = 0;
        for (int i = 1; i < x.length; i++) {
            if (x[i] < min) {
                min = x[i];
                index = i;
            }
        }
        int temp = x[index];
        x[index] = 0;

        for (int i = 0; i < x.length; i++) {
            x[i] -= temp;
        }
        return x;
    }

    public static void print(int[] x) {
        for (int i = 0; i < x.length; i++) {
            System.out.print(x[i] + " ");
        }
        System.out.println();
    }

}
