package OOP.Aufgaben.Raumverwaltung;

public class RaumTest {
    public static void main(String[] args) {
        Raum r1 = new Raum('C', '2', "30");

        Raum r2 = new Raum('C', '2', "40");
        Professor p1 = new Professor("Konstantin Koll");
        r2.setNutzer(p1);

        Raum r3 = new Raum('C', '2', "41");
        Professor p2 = new Professor("Michael Stark");
        r3.setNutzer(p2);

        Raum r4 = new Raum('A', '2', "02");
        Raum r5 = new Raum('A', '2', "03");

        Raumverwaltung rw = new Raumverwaltung();

        rw.addRaum(r1);
        rw.addRaum(r2);
        rw.addRaum(r3);
        rw.addRaum(r4);
        rw.addRaum(r5);

        rw.ausgabeRaumliste();
    }
}
