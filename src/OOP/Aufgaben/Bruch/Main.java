package OOP.Aufgaben.Bruch;

public class Main {
    public static void main(String[] args) {
        Bruch b1 = new Bruch();
        Bruch b2 = new Bruch(2,3);
        Bruch b3 = b2.kehrwert();
        Bruch b4 = b2.multiplizieren(b3);
        Bruch b5 = b2.addieren(b3);

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(b4);
        System.out.println(b5);
    }
}
