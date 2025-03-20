package Probeklausur.Aufgabe_016;

public class Tiger extends Tier {

    protected Tiger(String name, int alter) {
        super(name, alter);
    }

    @Override
    public boolean istAusgewachsen() {
        return alter >= 6;
    }
}
