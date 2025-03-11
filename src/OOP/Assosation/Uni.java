package OOP.Assosation;

public class Uni {
    public static void main(String[] args) {
        // default constructor
        Student s = new Student();

        s.setName("Yahya");
        s.setAge(26);
        s.setMatrikelnummer("123456");

        Kontakt s_kontakt_1 = new Kontakt("s_email@gmail.com");
        Kontakt s_kontakt_2 = new Kontakt("s_email2@gmail.com");

        s.addKontakt(s_kontakt_1); // index 0
        s.addKontakt(s_kontakt_2); // index 1

        Address s_address = new Address("Berlin", "12345", "TestStraße", 50);
        s.setAddress(s_address);

        System.out.println("Student s: ");
        System.out.println("Name: " + s.getName());
        System.out.println("Age: " + s.getAge());
        System.out.println("Matrikelnummer: " + s.getMatrikelnummer());
        s.printKontakte();



        Address s1_address = new Address("Berlin", "12345", "TestStraße", 50);
        Student s1 = new Student("Al Hamada", 25, "123456", 1.3f, s1_address);

        s1.setName("Ousama Al Hamada");
        System.out.println("\nStudent s1: ");
        String gewinnerName = s1.getName();
        System.out.println("Student " + gewinnerName + " hat die Chance auf ein Stipendium ");
        Kontakt s1_kontakt_1 = new Kontakt("osama@hotmail.com");
        s1.addKontakt(s1_kontakt_1);
        s1.printKontakte();

        Address s2_address = new Address("Berlin", "12345", "TestStraße", 50);
        Student s2 = new Student("Max", 24, s2_address);
        System.out.println("\nStudent s2: ");
        s2.setNote(1.0f);
        s2.setName("Max Mustermann");
        s2.printStudentInfo();
        s2.printKontakte();


        Address s3_address = new Address("Düsseldorf", "12345", "TestStraße", 50);
        Student s3 = new Student("Sara", 26);
        System.out.println("\nStudent s3: ");
        s3.setAddress(s3_address);
        s3.printStudentInfo();
        s3.printKontakte();

    }
}
