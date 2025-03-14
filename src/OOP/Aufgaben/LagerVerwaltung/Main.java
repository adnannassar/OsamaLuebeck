package OOP.Aufgaben.LagerVerwaltung;

public class Main {
    public static void main(String[] args) {
        Karton karton = new Karton("Karton", 2, 2, 2); // 8
        Dose dose = new Dose("Dose", 3, 4); // 12

        Lager lager = new Lager("Amazon Lager");

        lager.addBehaelter(karton);
        lager.addBehaelter(dose);

        System.out.println("Gesamt Volumen : " + lager.berechneGesamtVolumen());
        System.out.println("Anzahl Behälter: " + lager.getAnzahlBehaelter());
    }
}
