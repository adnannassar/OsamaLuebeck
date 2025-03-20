package Probeklausur.Aufgabe_016;

public class Trockenfutter implements Essbar {
    private int kohlenhydrate;

    public Trockenfutter(int kohlenhydrate) {
        this.kohlenhydrate = kohlenhydrate;
    }

    @Override
    public int ermittleNaehrwert() {
        return kohlenhydrate;
    }
}
