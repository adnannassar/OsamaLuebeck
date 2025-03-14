package OOP.Aufgaben.LagerVerwaltung;

public abstract class Behaelter {
    private String aufschrift;
    private int nummer;

    public Behaelter(String aufschrift) {
        this.aufschrift = aufschrift;
    }

    public String getAufschrift() {
        return aufschrift;
    }

    public int getNummer() {
        return nummer;
    }

    public abstract double berchneVolumen();

    private void test(){System.out.println("test");}
}
