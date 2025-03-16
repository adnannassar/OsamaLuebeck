package OOP.Aufgaben.Mitarbeiterverwaltung;

public class Abteilung {
    private String bezeichnung;
    private Mitarbeiter[] mitarbeiter = new Mitarbeiter[15];

    // {arbeiter a1, manager m1, null, angestllter an1, geschäftführer gf1, manager m2, angestllter an2, null, null, null ... , null}
    public Abteilung(String bezeichnung) {
        this.bezeichnung = bezeichnung;
    }

    public String getBezeichnung() {
        return bezeichnung;
    }

    public int getAnzahlMitarbeiter() {
        int anzahl = 0;
        for (int i = 0; i < mitarbeiter.length; i++) {
            if (mitarbeiter[i] != null) {
                anzahl++;
            }
        }
        return anzahl;
    }

    public void addMitarbeiter(Mitarbeiter mit) {
        for (int i = 0; i < mitarbeiter.length; i++) {
            if (mitarbeiter[i] == null) {
                mitarbeiter[i] = mit;
                break;
            }
        }
    }

    public Mitarbeiter getMitarbeiter(int index) {
        return mitarbeiter[index];
    }

    public double berechneGehaltskosten() {
        double summe = 0;
        for (int i = 0; i < mitarbeiter.length; i++) {
            if (mitarbeiter[i] != null) {
                summe += mitarbeiter[i].berechneGehalt();
            }
        }

        return summe;
    }
}
