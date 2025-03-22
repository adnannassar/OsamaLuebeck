package WrapperClasses;

import java.util.LinkedList;

public class Length {
    public static void main(String[] args) {
        // Array length durch ein Attribute "length"
        int[] array = {1, 2, 3};
        System.out.println(array.length);

        // String length durch einen Methoden-Aufruf "length()"
        String name = "Jane";
        System.out.println(name.length());

        // List length (ArrayList oder LinkedList) durch einen Methoden-Aufruf "size()"
        LinkedList<String> names = new LinkedList<>();
        System.out.println(names.size());

    }

    void add(){
        add();
    }
}
