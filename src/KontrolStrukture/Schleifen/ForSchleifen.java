package KontrolStrukture.Schleifen;

public class ForSchleifen {
    public static void main(String[] args) {
        System.out.print("For von 1 bis 5: ");
        for(int i = 1 ; i <= 5 ; i++){ // simi colon
            System.out.print(i + " ");
        }

        System.out.println(); // new line

        System.out.print("For von 5 bis 1: ");
        for(int i = 5 ; i >= 1; i--){
            System.out.print(i + " ");
        }

        System.out.println(); // new line

        System.out.print("For von 0 bis 10 (gerade zahlen):  ");
        for(int i = 0 ; i <= 10; i+=2){
            System.out.print(i + " ");
        }

        System.out.println(); // new line

        System.out.print("For von 11 bis 1 (ungerade zahlen): ");
        for(int i = 11 ; i >= 1; i-=2){
            System.out.print(i + " ");
        }


    }
}
