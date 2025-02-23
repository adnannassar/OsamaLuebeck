package KontrolStrukture.Schleifen;

public class WhileSchleifen {
    public static void main(String[] args) {
        System.out.print("For von 1 bis 5: ");
        for(int i = 1 ; i <= 5 ; i++){
            System.out.print(i + " ");
        }

        System.out.println();

        System.out.print("While von 1 bis 5: ");
        int i = 1;
        while(i <= 5){
            System.out.print(i + " ");
            i++;
        }

        System.out.println(); // new line

        System.out.print("For von 0 bis 10 (gerade zahlen): ");
        for(int j = 0 ; j <= 10; j+=2){
            System.out.print(j + " ");
        }

        System.out.println(); // new line

        System.out.print("While von 0 bis 10 (gerade zahlen): ");
        int j = 0;
        while(j <= 10){
            System.out.print(j + " ");
            j+=2;
        }
    }
}
