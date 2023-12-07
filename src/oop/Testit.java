package oop;

import java.util.ArrayList;
import java.util.Random;

public class Testit {
    public static void main(String[]args){
        Random r =new Random();
        ArrayList<Katze> mKatzenListe= new ArrayList();
        Katze katze = new Katze ();
        String[] charListe= {"bösartig","gutartig","listig","lieblich"};
        for (int i =1; i<=100; i++) {

            int ci = r.nextInt(charListe.length -1 - 0) + 0;
            mKatzenListe.add(new Katze(charListe[0],"nette","nackt","5","rosa","Sphinx"));
        }
katze.setAlter(1);
katze.setCharakter("Schmussekater");
katze.setFarbe("Pink mit blauen Streifen");
katze.setOberflaechenbeschaffenheit("flauschig");
katze.setName("Petti");

Katze katze2 = new Katze ("nette","nackt","5","rosa","Sphinx");
mKatzenListe.add(katze2);

for(Katze k:mKatzenListe){
    System.out.println("Meine Katze "+k.getName() + " ist " +k.getAlter() + " Jahr alt!");
}
    }

}
