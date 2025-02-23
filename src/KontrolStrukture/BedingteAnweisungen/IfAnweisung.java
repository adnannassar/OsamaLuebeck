package KontrolStrukture.BedingteAnweisungen;

public class IfAnweisung {
    public static void main(String[] args) {
        float note = 2.5f;

        if(note <= 4.0){
            System.out.println("bestanden");
        }else {
            System.out.println("nicht bestanden");
        }


        int number = 0;

        if(number > 0){
            System.out.println("positive Zahl");
        }
        else if(number == 0){
            System.out.println("Zahl ist 0");
        }
        else{
            System.out.println("negative Zahl");
        }


        float gesamteBachelorNote = 1.0f;

        if(gesamteBachelorNote <= 1.3){
            System.out.println("sehr gut");
        }
        else if(gesamteBachelorNote <= 2.5){
            System.out.println("gut");
        }
        else if(gesamteBachelorNote <= 3.5){
            System.out.println("befriedigend");
        }
        else if(gesamteBachelorNote <= 4.0){
            System.out.println("ausreichend");
        }
        else{
            System.out.println("nicht bestanden");
        }
    }
}
