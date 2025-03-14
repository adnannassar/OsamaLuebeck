package OOP.Aufgaben.LagerVerwaltung;

public class Lager {
    private String bezeichnung;
    private Behaelter[] behaelters = new Behaelter[500];

    public Lager(String bezeichnung) {
        this.bezeichnung = bezeichnung;
    }

    public String getBezeichnung() {
        return bezeichnung;
    }

    public boolean addBehaelter(Behaelter b) {
        for (int i = 0; i < behaelters.length; i++) {
            if (behaelters[i] == null) {
                behaelters[i] = b;
                return true;
            }
        }
        return false;
    }

    public int getAnzahlBehaelter() {
        int anzahl = 0;
        for (int i = 0; i < behaelters.length; i++) {
            if (behaelters[i] != null) {
                anzahl++;
            }
        }
        return anzahl;
    }

    public double berechneGesamtVolumen() {
        double summe = 0;
        for (int i = 0; i < behaelters.length; i++) {
            if (behaelters[i] != null) {
                summe += behaelters[i].berchneVolumen();
            }
        }

        return summe;
    }
}
