package OOP.Assosation;

public class Student {
    // Java Bean

    // Attribute
    private String name;
    private int age;
    private String matrikelnummer;
    private float note;
    private Address address;

    // Konstruktoren

    // default constructor
    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student(String name, int age, Address address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public Student(String name, int age, String matrikelnummer, float note, Address address) {
        this.name = name;
        this.age = age;
        this.matrikelnummer = matrikelnummer;
        this.note = note;
        this.address = address;
    }

    // Actions
    // Getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getMatrikelnummer() {
        return matrikelnummer;
    }

    public float getNote() {
        return note;
    }

    public Address getAddress() {
        return address;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setMatrikelnummer(String matrikelnummer) {
        this.matrikelnummer = matrikelnummer;
    }

    public void setNote(float note) {
        this.note = note;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void study() {
        System.out.println("Studiere...");
    }

    public void printStudentInfo() {
        if (name != null) {
            System.out.print("Name: " + name);
        }
        if (age != 0) {
            System.out.print(", Age: " + age);
        }
        if (matrikelnummer != null) {
            System.out.print(", Matrikelnummer: " + matrikelnummer);
        }
        if (note != 0) {
            System.out.print(", Note: " + note);
        }
        if (address != null) {
            if (address.getOrt() != null) {
                System.out.print(", Ort: " + address.getOrt());
            }
            if (address.getPlz() != null) {
                System.out.print(", PLZ: " + address.getPlz());
            }
            if (address.getStrasse() != null) {
                System.out.print(", Straße: " + address.getStrasse());
            }
            if (address.getHausnummer() != 0) {
                System.out.print(", Hausnummer: " + address.getHausnummer());
            }
        }

        System.out.println();
    }
}
