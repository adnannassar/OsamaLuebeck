package OOP.KlassenUndObjekten;

public class Student {
    // Java Bean

    // Attribute
    private String name;
    private int age;
    private String matrikelnummer;
    private float note;
    private String ort;
    private String plz;
    private String strasse;
    private int hausnummer;

    // Konstruktoren

    // default constructor
    public Student() {}

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student(String name, int age, String ort, String plz, String strasse, int hausnummer) {
        this.name = name;
        this.age = age;
        this.ort = ort;
        this.plz = plz;
        this.strasse = strasse;
        this.hausnummer = hausnummer;
    }

    public Student(String name, int age, String matrikelnummer, float note, String ort, String plz, String strasse, int hausnummer) {
        this.name = name;
        this.age = age;
        this.matrikelnummer = matrikelnummer;
        this.note = note;
        this.ort = ort;
        this.plz = plz;
        this.strasse = strasse;
        this.hausnummer = hausnummer;
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

    public String getOrt() {
        return ort;
    }

    public String getPlz() {
        return plz;
    }

    public String getStrasse() {
        return strasse;
    }

    public int getHausnummer() {
        return hausnummer;
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

    public void setOrt(String ort) {
        this.ort = ort;
    }

    public void setPlz(String plz) {
        this.plz = plz;
    }

    public void setStrasse(String strasse) {
        this.strasse = strasse;
    }

    public void setHausnummer(int hausnummer) {
        this.hausnummer = hausnummer;
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
        if (ort != null) {
            System.out.print(", Ort: " + ort);
        }
        if (plz != null) {
            System.out.print(", PLZ: " + plz);
        }
        if (strasse != null) {
            System.out.print(", Straße: " + strasse);
        }
        if (hausnummer != 0) {
            System.out.print(", Hausnummer: " + hausnummer);
        }
        System.out.println();
    }
}
