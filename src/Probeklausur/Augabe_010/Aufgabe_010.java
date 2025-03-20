package Probeklausur.Augabe_010;

import java.util.ArrayList;
import java.util.Arrays;

public class Aufgabe_010 {
    public static void main(String[] args) {
        mystery(new ArrayList<>(Arrays.asList("Albert", "Immo", "Marc", "Ian", "Stefan", "Regine", "Bennet", "Anna")));
    }
    public static void mystery(ArrayList<String> worte){

        ArrayList<String> neueWorte = new ArrayList<String>();

        while(worte.size() > 0){
            int index = 0;
            int laenge = Integer.MAX_VALUE;
            for(int i = 0 ; i < worte.size() ; i++){
                if(worte.get(i).length() < laenge){
                    laenge = worte.get(i).length();
                    index = i;
                }
            }
            neueWorte.add(worte.remove(index));
        }
        for(int i = 0 ; i < neueWorte.size() ; i++){
            System.out.println(neueWorte.get(i));
        }
    }

}
