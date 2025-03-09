package Arrays.OneDimArray;

public class ErsteSchritteInOneDimArray {
    public static void main(String[] args) {
        // Array erstelle, wenn die werte schon bekannt sind
        int[] array1 = {50, 60, 70};

        System.out.println("Array 1");
        System.out.println("Länge des Arrays: " + array1.length);
        // System.out.println(x[-1]);// ArrayIndexOutOfBoundsException (fehler)

        // index schreibweise
        System.out.println("Wert at Index 0 : " + array1[0]);
        System.out.println("Wert at Index 1 : " + array1[1]);
        System.out.println("Wert at Index 2 : " + array1[2]);

        // System.out.println(x[3]); // ArrayIndexOutOfBoundsException (fehler)


        // Array erstellen, wenn die werte noch nicht bekannt sind
        System.out.println("\nArray 2");

        int[] array2 = new int[3];
        System.out.println("Länge des Arrays: " + array2.length);

        // Werte setzen
        array2[0] = 150;
        array2[1] = 160;
        array2[2] = 170;

        // werte auslesen
        System.out.println("Wert at Index 0 : " + array2[0]);
        System.out.println("Wert at Index 1 : " + array2[1]);
        System.out.println("Wert at Index 2 : " + array2[2]);
    }
}
