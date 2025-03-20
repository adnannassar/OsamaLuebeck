package Probeklausur.Aufgabe_016;

public class Main {
    public static void main(String[] args) {
        Elefant dumbo = new Elefant("Dumbo", 3);
        Tiger shirkhan = new Tiger("Shir Khan", 12);

        Trockenfutter t1 = new Trockenfutter(345);
        dumbo.fuettern(t1);


        Nassfutter ns1 = new Nassfutter(1255, 1); // 1256
        shirkhan.fuettern(ns1);

        dumbo.verdauen();
        shirkhan.verdauen();

    }
}
