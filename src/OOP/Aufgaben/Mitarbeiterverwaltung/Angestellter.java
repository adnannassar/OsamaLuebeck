package OOP.Aufgaben.Mitarbeiterverwaltung;

public class Angestellter extends Mitarbeiter {
    private double grundgehalt;
    private double ortszuschlag;
    private double zulage;


    // super constructor!
    public Angestellter(
            String name,
            double grundgehalt,
            double ortszuschlag,
            double zulage,
            Abteilung abteilung) {
        super(name, abteilung);
        this.grundgehalt = grundgehalt;
        this.ortszuschlag = ortszuschlag;
        this.zulage = zulage;
    }

    // implementierung der abstrakte Methode
    @Override
    public double berechneGehalt() {
        return grundgehalt + ortszuschlag + zulage;
    }
}
