package Rekursiv;

public class Main {
    public static void main(String[] args) {
        System.out.println("!4 = " + faklutät(4));
        ulam(1);
        ulam(2);
        ulam(3);
        ulam(18);

        printThue(16);

        printHallo("Adnan");
        printHallo("Ali");
        printHallo("Osama");
    }

    public static int faklutät(int n) {
        if (n == 1) {
            return 1;
        }
        return n * faklutät(n - 1);
    }

    public static void ulam(int n) {
        if (n != 1) {
            System.out.print("ulm(" + n + ")" + " --> ");
        }
        if (n == 1) {
            System.out.println("ulm(" + n + ") --> 1");
        } else if (n % 2 == 0) {
            ulam(n / 2);
        } else {
            ulam(3 * n + 1);
        }
    }

    public static int thue(int n) {
        if (n == 0) {
            return 0;
        } else if (n % 2 == 0) {
            return thue(n / 2);
        } else {
            return 1 - thue(n - 1);
        }
    }

    public static void printThue(int n) {
        System.out.print("Thue-Morse-Folge von (32): ");
        for (int i = 0; i < n; i++) {
            System.out.print(thue(i));
        }
        System.out.println();
    }

    public static int add() {
        int a = 1; // define number one as a
        int b = 2; // define number two as b
        int c = a + b; // define number c as result of adding a and b
        return c; // return the result which is c
    }

    public static int div(int a, int b) {
        if (b == 0) {
            System.out.println("Division by zero is not allowed!");
            return -1;
        }
        if (b == 1) {
            return a;
        } else {
            int c = a / b; // define number c as result of dividing a and b
            return c; // return the result which is c
        }
    }

    public static void printFromOneToTen(){
        for(int i = 1; i <= 10; ){
            System.out.println(i);
        }
    }

    public static void printHallo(String name){
        System.out.println("Hallo Osama");
    }
}
