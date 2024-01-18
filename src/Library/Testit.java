package Library;

import java.util.ArrayList;
import java.util.Random;
public class Testit {
    public static void main(String[]args){
        Random r =new Random();
        ArrayList<Buch> mKBuchListe= new ArrayList();
        Buch buch = new Buch ();
        String[] GenreListe= {"bösartige","gutartige","listige","liebliche"};
        String[] AutorListe= {"nackte","flauschige","Kurzhaarige","tode"};
        int[] SeitenanzahlListe= {3,2,1,4,9,5,6,7};
        String[] TitelListe= {"pink","blau","weiß","schwarz","grau","orange","braun","fleckig"};
        String[] JahrListe= {"Sphinx","Snowflake","Luna","Honey","Dewy","Dewdrop","Cake","Cinnamon"};
        for (int i =1; i<=100; i++) {

            int ci = r.nextInt(GenreListe.length -1 - 0) + 0;
            int ni = r.nextInt(AutorListe.length -1 - 0) + 0;
            int fi = r.nextInt(SeitenanzahlListe.length -1 - 0) + 0;
            int oi = r.nextInt(TitelListe.length -1 - 0) + 0;
            int ai = r.nextInt(JahrListe.length -1 - 0) + 0;
            mKatzenListe.add(new Katze(charListe[ci],oberflaechListe[ni],alterListe[fi],farbeListe[oi],nameListe[ai]));
        }
        katze.setAlter(1);
        katze.setCharakter("Schmussekater");
        katze.setFarbe("Pink mit blauen Streifen");
        katze.setOberflaechenbeschaffenheit("flauschig");
        katze.setName("Petti");

        Katze katze2 = new Katze ("nette","nackte",5,"rosa","Sphinx");
        mKatzenListe.add(katze2);
        Haus haus = new Haus ( 350, "Buxdehude 4, 88732", 8, 5, maxkatzenalter >=5);
        Haus haus2 = new Haus ( 400, "FU 3 6969", 10, 8);
        haus.getInfo();


        for(Katze k:mKatzenListe){
            System.out.println("Meine Katze "+k.getName() + " ist " +k.getAlter() + " Jahre alt, sie ist eine " +k.getCharakter() +" " +k.getFarbe()
                    +"farbige"  +  " "    +k.getOberflaechenbeschaffenheit() + " Katze.");

            haus.addKatze(k);
        }
        haus.getKatzenImHaus();
    }

}

}
