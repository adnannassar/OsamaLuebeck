package OOP.Aufgaben.LagerVerwaltung;

public class Karton extends Behaelter {
    private double breite;
    private double hoehe;
    private double tiefe;

    public Karton(String aufschrift, double breite, double hoehe, double tiefe) {
        super(aufschrift);
        this.breite = breite;
        this.hoehe = hoehe;
        this.tiefe = tiefe;
    }

    public double getBreite() {
        return breite;
    }

    public double getHoehe() {
        return hoehe;
    }

    public double getTiefe() {
        return tiefe;
    }

    @Override
    public double berchneVolumen() {
        return breite * hoehe * tiefe;
    }
}
