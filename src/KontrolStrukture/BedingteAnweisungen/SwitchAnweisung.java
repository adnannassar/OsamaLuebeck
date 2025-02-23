package KontrolStrukture.BedingteAnweisungen;

public class SwitchAnweisung {
    public static void main(String[] args) {
        int gesamteBachelorNote = 2;

        switch (gesamteBachelorNote) {
            case 1:
                System.out.println("sehr gut");
                break;
            case 2:
                System.out.println("gut");
                break;
            case 3:
                System.out.println("befriedigend");
                break;
            case 4:
                System.out.println("Nicht bestanden!");
                break;
            default:
                System.out.println("Note ist nicht gültig");
        }
    }
}
