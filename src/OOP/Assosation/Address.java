package OOP.Assosation;

public class Address {
    private String ort;
    private String plz;
    private String strasse;
    private int hausnummer;

    public Address(String ort, String plz, String strasse, int hausnummer) {
        this.ort = ort;
        this.plz = plz;
        this.strasse = strasse;
        this.hausnummer = hausnummer;
    }

    public String getOrt() {
        return ort;
    }

    public void setOrt(String ort) {
        this.ort = ort;
    }

    public String getPlz() {
        return plz;
    }

    public void setPlz(String plz) {
        this.plz = plz;
    }

    public String getStrasse() {
        return strasse;
    }

    public void setStrasse(String strasse) {
        this.strasse = strasse;
    }

    public int getHausnummer() {
        return hausnummer;
    }

    public void setHausnummer(int hausnummer) {
        this.hausnummer = hausnummer;
    }
}
