package OOP;

public class Uni {
    public static void main(String[] args) {
        // default constructor
        Student s = new Student();
        s.setName("Ousama");
        s.setAge(26);
        s.setMatrikelnummer("123456");
        System.out.println("Student s: ");
        System.out.println("Name: " + s.getName());
        System.out.println("Age: " + s.getAge());
        System.out.println("Matrikelnummer: " + s.getMatrikelnummer());


        Student s1 = new Student("Al Hamada", 25, "123456", 1.3f, "Berlin", "12345", "TestStraße", 50);

        s1.setName("Ousama Al Hamada");
        System.out.println("\nStudent s1: ");
        String gewinnerName = s1.getName();
        System.out.println("Student " + gewinnerName + " hat die Chance auf ein Stipendium ");


        Student s2 = new Student("Max", 24, "Berlin", "12345", "TestStraße", 50);
        System.out.println("\nStudent s2: ");
        s2.setNote(1.0f);
        s2.setName("Max Mustermann");
        s2.printStudentInfo();


        Student s3 = new Student("Ousama", 26);
        System.out.println("\nStudent s3: ");
        s3.setOrt("Düsseldorf");
        s3.printStudentInfo();

    }
}
