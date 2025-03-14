package OOP.Aufgaben.Bruch;

public class Bruch extends Object {
    private int zeahler;
    private int nenner;

    public Bruch() {
        this.zeahler = 1;
        this.nenner = 1;
    }

    public Bruch(int zeahler, int nenner) {
        this.zeahler = zeahler;
        this.nenner = nenner;
    }

    public int getZeahler() {
        return zeahler;
    }

    public int getNenner() {
        return nenner;
    }

    public Bruch kehrwert() {
        Bruch erg = new Bruch(this.nenner, this.zeahler);
        return erg;
    }

    public Bruch addieren(Bruch b) {
        int neuerZeahler = (this.nenner * b.zeahler) + (this.zeahler * b.nenner);
        int neuerNenner = this.nenner * b.nenner;
        Bruch erg = new Bruch(neuerZeahler, neuerNenner);
        return erg;
    }

    public Bruch multiplizieren(Bruch b) {
        Bruch erg = new Bruch(this.zeahler * b.zeahler, this.nenner * b.nenner);
        return erg;
    }

    @Override
    public String toString() {
        if (zeahler == nenner) {
            return nenner + "/" + zeahler + " = 1";
        }
        return nenner + "/" + zeahler;
    }
}
