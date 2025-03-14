package OOP.Aufgaben.LagerVerwaltung;

public class Dose extends Behaelter {
    private double radius;
    private double hoehe;

    public Dose(String aufschrift, double radius, double hoehe) {
        super(aufschrift);
        this.radius = radius;
        this.hoehe = hoehe;
    }

    public double getRadius() {
        return radius;
    }

    public double getHoehe() {
        return hoehe;
    }

    @Override
    public double berchneVolumen() {
        return radius * hoehe;
    }
}
