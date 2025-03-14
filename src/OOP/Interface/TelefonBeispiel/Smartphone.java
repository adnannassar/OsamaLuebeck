package OOP.Interface.TelefonBeispiel;

import java.time.LocalTime;

public class Smartphone extends Telefon implements Uhr {
    private double displayGroesse;
    private SMS[] messages = new SMS[1000];

    public Smartphone(int id, String rufnummer, double displayGroesse) {
        super(id, rufnummer);
        this.displayGroesse = displayGroesse;
    }

    public double getDisplayGroesse() {
        return displayGroesse;
    }

    @Override
    public LocalTime getUhrZeit() {
        return LocalTime.now();
    }

    public int getAnzahlSMS() {
        int anzahl = 0;
        for (int i = 0; i < messages.length; i++) {
            if (messages[i] != null) {
                anzahl++;
            }
        }
        return anzahl;
    }

    public void addSMS(SMS sms) {
        for(int i = 0; i < messages.length; i++) {
            if (messages[i] == null) {
                messages[i] = sms;
                break;
            }
        }
    }

    public void ausgabeSMS(){
        for(int i = 0; i < messages.length; i++) {
            if (messages[i] != null) {
                System.out.println("Empfänger ID: " +   messages[i].getEmpfaengerId() + ", Text: " + messages[i].getText());
            }
        }
    }

    @Override
    public String toString(){
        return "ID: " + getId() + ", Rufnummer: " + getRufnummer() + ", Display Größe: " + getDisplayGroesse();
    }



}
