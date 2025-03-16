package OOP.Aufgaben.Mitarbeiterverwaltung;

public abstract class Mitarbeiter {
    private String name;
    private int personalnummer;
    private int anzahlMitarbeiter;
    private Abteilung abteilung;

    public Mitarbeiter(String name, Abteilung abteilung) {
        this.name = name;
        this.abteilung = abteilung;
    }

    public abstract double berechneGehalt();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPersonalnummer() {
        return personalnummer;
    }

    public Abteilung getAbteilung() {
        return abteilung;
    }
}
