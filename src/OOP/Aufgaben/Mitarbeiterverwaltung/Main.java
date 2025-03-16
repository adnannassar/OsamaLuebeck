package OOP.Aufgaben.Mitarbeiterverwaltung;

public class Main {
    public static void main(String[] args) {

        Abteilung IT = new Abteilung("IT Abteilung");

        Arbeiter arbeiter = new Arbeiter("Sami", 10, 15, 12, IT);
        System.out.println("Gehalt von " + arbeiter.getName() + " ohne Überstunden: " + arbeiter.berechneGehalt() + "€");
        arbeiter.setAnzahlÜberstunden(5);
        System.out.println("Brutto Gehalt von " + arbeiter.getName() + " mit  Überstunden: " + arbeiter.berechneGehalt() + "€");
        System.out.println("Netto von " + arbeiter.getName() + ": " + arbeiter.berechneNettoGehalt(3) + "€");

        Angestellter angestellter = new Angestellter("Ahmad", 2000, 200, 100, IT);
        System.out.println("\nGehalt von " + angestellter.getName() + ": " + angestellter.berechneGehalt() + "€");

        Manager manager = new Manager("Osama", 5000, 1000, IT);
        System.out.println("\nGehalt von " + manager.getName() + " Ohne Umsatz: " + manager.berechneGehalt() + "€");
        manager.setUmsatz(700);
        System.out.println("Gehalt von " + manager.getName() + " mit  Umsatz: " + manager.berechneGehalt() + "€");

        Geschäftsführer geschäftsführer = new Geschäftsführer("Sara", 7000, 1000, 600, IT);
        System.out.println("\nGehalt von " + geschäftsführer.getName() + ": " + geschäftsführer.berechneGehalt() + "€");

        IT.addMitarbeiter(arbeiter);
        IT.addMitarbeiter(angestellter);
        IT.addMitarbeiter(manager);
        IT.addMitarbeiter(geschäftsführer);

        System.out.println("\nAnzahl von Mitarbeiter in der " + IT.getBezeichnung() + ": " + IT.getAnzahlMitarbeiter());
        System.out.println("\nName von den ersten Mitarbeiter in der Abteilung: " + IT.getMitarbeiter(0).getName());

        System.out.println("\nGesamt Kosten der " + IT.getBezeichnung() + ": " + IT.berechneGehaltskosten() + "€");
    }
}
