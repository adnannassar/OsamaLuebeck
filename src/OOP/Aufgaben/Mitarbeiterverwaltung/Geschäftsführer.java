package OOP.Aufgaben.Mitarbeiterverwaltung;

public class Geschäftsführer extends Manager {
    private double zulage;

    // super constructor
    public Geschäftsführer(
            String name,
            double festgehalt,
            double provision,
            double zulage,
            Abteilung abteilung
    ) {
        super(name, festgehalt, provision, abteilung);
        this.zulage = zulage;
    }

    @Override
    public double berechneGehalt() {
         return super.berechneGehalt()  + zulage;
    }
}
