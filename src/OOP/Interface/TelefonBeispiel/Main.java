package OOP.Interface.TelefonBeispiel;

public class Main {
    public static void main(String[] args) {
        Smartphone iphone16 = new Smartphone(1, "0123123123", 8.5);
        System.out.println(iphone16);
        System.out.println(iphone16.getUhrZeit());

        SMS sms1 = new SMS(10, "Hallo wie geht's dir?");
        SMS sms2 = new SMS(11, "Hallo, mir geht's gut, und selbst?");
        SMS sms3 = new SMS(10, "Danke schön. Mir geht's auch gut.");
        SMS sms4 = new SMS(11, "Freut mich!");

        iphone16.addSMS(sms1);
        iphone16.addSMS(sms2);
        iphone16.addSMS(sms3);
        iphone16.addSMS(sms4);

        iphone16.ausgabeSMS();

        System.out.println("Anzahl SMS: " + iphone16.getAnzahlSMS());


    }
}
