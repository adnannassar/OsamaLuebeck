package Datastructure.Set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Set<Integer> set = new LinkedHashSet<>();
        set.add(3);
        set.add(1);
        set.add(2);
        set.add(1);

        System.out.println("LinkedHashSet: " + set);


        Set<Integer> set2 = new HashSet<>();
        set2.add(3);
        set2.add(1);
        set2.add(2);
        set2.add(1);

        System.out.println("HashSet: " + set2);



        Set<Integer> set3 = new TreeSet<>();
        set3.add(3);
        set3.add(1);
        set3.add(2);
        set3.add(1);

        System.out.println("TreeSet: " + set3);
    }
}
