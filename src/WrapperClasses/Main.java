package WrapperClasses;

public class Main {
    public static void main(String[] args) {
        byte n = 1;
        Byte m = 2;

        short s = 3;
        Short u = 4;

        int x = 10; // primitive daten typ
        Integer y = 20; // Wrapper class of int = hüllen klasse von int

        long z = 30;
        Long zz = 40L;

        float w = 5.0f;
        Float f = 6.0f;

        double d = 7.0;
        Double dd = 8.0;

        char a = 'a';
        Character b = 'b';

        boolean c = true;
        Boolean cc = true;

        String name2 = "ALi";


        // convert from String to int
        String numberAsString = "123";
        System.out.println("Before convert: " + (numberAsString + 5));

        int numberAsInt = Integer.parseInt(numberAsString);
        System.out.println("After convert: " + (numberAsInt + 5));


        // convert from int to String
        int number_1 = 123;
        System.out.println("\nBefore convert: " + (number_1 + 5));

        String numberAsString2 = String.valueOf(numberAsInt);
        System.out.println("After convert: " + (numberAsString2 + 5));

        // compare to
        String name_001 = "Jane";
        String name_002 = "Jane";
        System.out.println("\nCompareTo: ");
        int compareResult = name_001.compareTo(name_002);
        if (compareResult == 0) {
            System.out.println(name_001 + " ist gleich " + name_002);
        } else if (compareResult < 0) {
            System.out.println(name_001 + " ist kleiner als " + name_002);
        } else {
            System.out.println(name_001 + " ist großer als " + name_002);
        }


    }
}
