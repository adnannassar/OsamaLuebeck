package OOP.Aufgaben.Raumverwaltung;

public class Raumverwaltung {
    private Raum[] räume = new Raum[100]; // {null, null, null, .... , null}

    public Raumverwaltung() {}

    public void addRaum(Raum raum){
        for(int i = 0; i < räume.length; i++){
            if(räume[i] == null){
                räume[i] = raum;
                break;
            }
        }
    }

    public void ausgabeRaumliste(){
        for(int i = 0; i < räume.length; i++){
            if(räume[i] != null){
                String ausgabe = räume[i].getTrakt() + "." + räume[i].getEtage() + "." + räume[i].getNummer()+": ";
                if(räume[i].getNutzer() != null){
                    ausgabe += räume[i].getNutzer().getName();
                }
                System.out.println(ausgabe);
            }
        }
    }

}
