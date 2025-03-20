package Probeklausur.Aufgabe_016;

public class Nassfutter implements Essbar {
    private int proteine;
    private int fett;

    public Nassfutter(int proteine, int fett) {
        this.proteine = proteine;
        this.fett = fett;
    }

    @Override
    public int ermittleNaehrwert() {
        return proteine + fett;
    }
}
