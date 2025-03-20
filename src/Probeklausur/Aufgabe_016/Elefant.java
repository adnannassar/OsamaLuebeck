package Probeklausur.Aufgabe_016;

public class Elefant extends Tier {

    protected Elefant(String name, int alter) {
        super(name, alter);
    }

    @Override
    public boolean istAusgewachsen() {
        return alter >= 20;
    }
}
