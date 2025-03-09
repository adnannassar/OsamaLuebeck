package OOP.UML;

public class DozentTest {
    public static void main(String[] args) {
        // deklaration
        Dozent dieDozentin;
        Dozent derDekan;

        // initialisierung oder erzeugung
        dieDozentin = new Dozent("Dr. Maria Müller", "Informatik", 'w');
        dieDozentin.setLehrgebiet("Physik");

        derDekan = new Dozent("Prof. Dr. Hans Meier", "Mathematik", 'm');
        derDekan.setDekan(true);


        System.out.println("Der Dekan Informationen:");
        System.out.println("Name: " + derDekan.getName());
        System.out.println("Geschlecht: " + derDekan.getGeschlecht());
        System.out.println("Lehrgebiet: " + derDekan.getLehrgebiet());
        System.out.println("Ist Dekan: " + derDekan.isDekan());

        System.out.println("\nDie Dozentin Informationen:");
        System.out.println("Name: " + dieDozentin.getName());
        System.out.println("Geschlecht: " + dieDozentin.getGeschlecht());
        System.out.println("Lehrgebiet: " + dieDozentin.getLehrgebiet());
        System.out.println("Ist Dekan: " + dieDozentin.isDekan());

    }
}
