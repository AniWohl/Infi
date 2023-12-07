package oop;

import java.util.ArrayList;

public class Testit {
    public static void main(String[]args){
        ArrayList<Katze> mKatzenListe= new ArrayListe();
        Katze katze = new Katze ();
        for (int i =1; i<=100; i++) {
            mKatzenListe.add(katze);
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

    private static class ArrayListe extends ArrayList<Katze> {
    }
}
