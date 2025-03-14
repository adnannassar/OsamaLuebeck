package OOP.Vererbung;

public class Student extends Person{
    public Student(String name, int alter) {
        super(name, alter);
    }

    @Override
    public String toString() {
        return "Student --> Name: " + getName() + ", Alter: " + getAlter();
    }
}
