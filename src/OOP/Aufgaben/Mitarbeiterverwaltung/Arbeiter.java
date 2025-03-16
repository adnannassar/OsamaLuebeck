package OOP.Aufgaben.Mitarbeiterverwaltung;

public class Arbeiter extends Mitarbeiter implements Steuersetzung {
    private double stundenlohn;
    private double anzahlStunden;
    private double überstundenzuschlag;
    private double anzahlÜberstunden;

    public Arbeiter(String name,
                    double stundenlohn,
                    double anzahlStunden,
                    double überstundenzuschlag,
                    Abteilung abteilung) {
        super(name, abteilung);
        this.stundenlohn = stundenlohn;
        this.anzahlStunden = anzahlStunden;
        this.überstundenzuschlag = überstundenzuschlag;
    }

    public void setAnzahlÜberstunden(double anzahlÜberstunden) {
        this.anzahlÜberstunden = anzahlÜberstunden;
    }

    @Override
    public double berechneGehalt() {
        return (anzahlStunden * stundenlohn) + (überstundenzuschlag * anzahlÜberstunden);
    }

    @Override
    public double berechneNettoGehalt(int steuerKlasse) {
        double brutto = berechneGehalt();
        double netto;
        switch (steuerKlasse) {
            case 1:
                netto = brutto - brutto * 0.4;
                return netto;

            case 2:
                netto = brutto - brutto * 0.25;
                return netto;

            case 3:
                netto = brutto - brutto * 0.15;
                return netto;

            default:
                return 0;

        }
    }
}
