package Methoden;

public class Methoden {
    public static void main(String[] args) {
        // methoden aufrufen
        add(7, 3);
        sub(10, 5);
        mul(2, 3);
        div(4, 2);

        String benutzerName = "Max";

        sagWelcome();

        if (benutzerName == "Max") {
            float summe = summeWarenkorb(4.0f, 2.5f);
            float discount = summe - (summe * 0.1f);
            System.out.println("Die Summe des Warenkorbs beträgt: " + discount);
        } else {
            float summe = summeWarenkorb(4.0f, 2.5f);
            System.out.println("Die Summe des Warenkorbs beträgt: " + summe);
        }
    }

    public static void sagWelcome(){
        System.out.println("------------------------------------");
        System.out.println("Willkommen im Supermarkt");
        System.out.println("Bitte wählen Sie Ihre Produkte aus");
        System.out.println("------------------------------------");
    }

    public static float summeWarenkorb(float colaPrice, float chipsPrice) {
        float summe = colaPrice + chipsPrice;
        return summe;
    }

    public static void add(int x, int y) {
        int z = x + y;
        System.out.println("Die Summe von x(" + x + ") und y(" + y + ") ist: " + z);
    }

    public static void sub(int x, int y) {
        int z = x - y;
        System.out.println("Die Sub von x(" + x + ") und y(" + y + ") ist: " + z);
    }

    public static void mul(int x, int y) {
        int z = x * y;
        System.out.println("Die Multiplikation von x(" + x + ") und y(" + y + ") ist: " + z);
    }

    public static void div(int x, int y) {
        int z = x / y;
        System.out.println("Die Division von x(" + x + ") und y(" + y + ") ist: " + z);
    }
}


