package OOP.Vererbung;

public class Mitarbeiter extends Person {
    public Mitarbeiter(String name, int alter) {
        super(name, alter);
    }

    @Override
    public String toString() {
        return "Mitarbeiter --> Name: " + getName() + ", Alter: " + getAlter();
    }
}
