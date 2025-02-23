package KontrolStrukture.Schleifen;

public class DoWhileSchleife {
    public static void main(String[] args) {
        System.out.print("For von 1 bis 5: ");
        for (int i = 50; i <= 5; i++) {
            System.out.print(i + " ");
        }

        System.out.println();

        System.out.print("While von 1 bis 5: ");
        int i = 50;
        while (i <= 5) { // kopf gesteuerte Schleife
            System.out.print(i + " ");
            i++;
        }

        System.out.println(); // new line
        System.out.print("Do-While von 1 bis 5: ");
        int j = 50;
        do {
            System.out.print(j + " ");
            j++;
        } while (j <= 5); // fuß gesteuerte Schleife
    }
}
