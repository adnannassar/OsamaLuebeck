package Probeklausur.Aufgabe_016;

public abstract class Tier {
    private String name;
    private int hunger = 100;
    protected int alter;

    protected Tier(String name, int alter) {
        this.name = name;
        this.alter = alter;
    }

    public abstract boolean istAusgewachsen();

    public void fuettern(Essbar essbar) {
        hunger -= essbar.ermittleNaehrwert();
    }

    public void verdauen() {
        hunger = 100;
        System.out.println(name + " hat noch " + hunger + " Hunger");


    }
}
