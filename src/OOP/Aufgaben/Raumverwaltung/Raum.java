package OOP.Aufgaben.Raumverwaltung;

public class Raum {
    private char trakt;
    private char etage;
    private String nummer;
    private Professor nutzer;

    public Raum(char trakt, char etage, String nummer) {
        this.trakt = trakt;
        this.etage = etage;
        this.nummer = nummer;
    }

    public char getTrakt() {
        return trakt;
    }

    public char getEtage() {
        return etage;
    }

    public void setNummer(String nummer) {
        this.nummer = nummer;
    }

    public String getNummer() {
        return nummer;
    }

    public void setNutzer(Professor nutzer) {
        this.nutzer = nutzer;
    }

    public Professor getNutzer() {
        return nutzer;
    }

    public void removeNutzer() {
        nutzer = null;
    }
}
