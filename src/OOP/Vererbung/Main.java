package OOP.Vererbung;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Max Mustermann", 20);

        Mitarbeiter mitarbeiter = new Mitarbeiter("Hans Müller", 30);
        Student student = new Student("Peter Meier", 25);
        Professor professor = new Professor("Prof. Dr. Peter Schmidt", 50);

        System.out.println(person);
        System.out.println(mitarbeiter);
        System.out.println(student);
        System.out.println(professor);

    }

}
