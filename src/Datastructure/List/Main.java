package Datastructure.List;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();

        list.add(1);
        list.add(2);
        list.add(3);

        System.out.println(list);

        list.removeFirst();
        System.out.println(list);

        list.removeLast();
        System.out.println(list);

        list.add(1, 7);
        System.out.println(list);

        list.set(1, 3);
        System.out.println(list);

        list.addLast(7);
        System.out.println(list);

        boolean gefunden_7 = list.contains(7);
        if (gefunden_7) {
            System.out.println("7 gefunden");
        } else {
            System.out.println("7 nicht gefunden");
        }

        list.addFirst(1);
        System.out.println(list);
        boolean gefunden_1 = list.contains(1);
        if (gefunden_1) {
            System.out.println("1 gefunden");
        } else {
            System.out.println("1 nicht gefunden");
        }

        System.out.println("Size of the List is: " + list.size());
        int erg = list.get(2);
        System.out.println("Number at Index [2] : " + erg);

        LinkedList<String> names1 = new LinkedList<>();
        names1.addFirst("John");
        names1.addFirst("Jane");
        names1.addFirst("Jack");


        LinkedList<String> names2 = new LinkedList<>();
        names2.addFirst("Jane");
        names2.addFirst("Jack");

        boolean list2IstInList1 = names1.containsAll(names2);
        if (list2IstInList1) {
            System.out.print(names2 + " ist in " + names1);
        } else {
            System.out.print(names2 + " ist nicht in " + names1);
        }


    }
}
