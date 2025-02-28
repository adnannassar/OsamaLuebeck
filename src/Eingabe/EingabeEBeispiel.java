package Eingabe;

import java.util.Scanner;

public class EingabeEBeispiel {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Bitte geben Sie Ihren Namen ein: ");
        String name = s.next();

        System.out.print("Bitte geben Sie Ihre Geburtsjahr ein: ");
        int jahr = s.nextInt();

        System.out.println("Hallo " + name + ", Sie sind " + (2025 - jahr) + " Jahre alt.");
    }
}
