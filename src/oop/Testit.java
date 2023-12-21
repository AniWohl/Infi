package oop;

import java.util.ArrayList;
import java.util.Random;

public class Testit {
    public static void main(String[]args){
        Random r =new Random();
        ArrayList<Katze> mKatzenListe= new ArrayList();
        Katze katze = new Katze ();
        String[] charListe= {"bösartige","gutartige","listige","liebliche"};
        String[] oberflaechListe= {"nackte","flauschige","Kurzhaarige","fette","tode"};
        int[] alterListe= {3,2,1,4,9,5,6,7};
        String[] farbeListe= {"pink","blau","weiß","schwarz","grau","orange","braun","fleckig"};
        String[] nameListe= {"Sphinx","Snowflake","Luna","Honey","Dewy","Dewdrop","Cake","Cinnamon"};
        for (int i =1; i<=100; i++) {

            int ci = r.nextInt(charListe.length -1 - 0) + 0;
            int ni = r.nextInt(oberflaechListe.length -1 - 0) + 0;
            int fi = r.nextInt(alterListe.length -1 - 0) + 0;
            int oi = r.nextInt(farbeListe.length -1 - 0) + 0;
            int ai = r.nextInt(nameListe.length -1 - 0) + 0;
            mKatzenListe.add(new Katze(charListe[ci],oberflaechListe[ni],alterListe[fi],farbeListe[oi],nameListe[ai]));
        }
katze.setAlter(1);
katze.setCharakter("Schmussekater");
katze.setFarbe("Pink mit blauen Streifen");
katze.setOberflaechenbeschaffenheit("flauschig");
katze.setName("Petti");

Katze katze2 = new Katze ("nette","nackte",5,"rosa","Sphinx");
mKatzenListe.add(katze2);

for(Katze k:mKatzenListe){
    System.out.println("Meine Katze "+k.getName() + " ist " +k.getAlter() + " Jahre alt, sie ist eine " +k.getCharakter() +" " +k.getFarbe()
    +"farbige"  +  " "    +k.getOberflaechenbeschaffenheit() + " Katze.");
}
    }

}
