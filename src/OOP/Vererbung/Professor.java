package OOP.Vererbung;

public class Professor extends Person {

    public Professor(String name, int alter) {
        super(name, alter);
    }

    @Override
    public String toString() {
        return "Professor --> Name: " + getName() + ", Alter: " + getAlter();
    }
}
