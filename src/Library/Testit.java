package Library;

import java.util.ArrayList;
import java.util.Random;

import static Library.Buch.*;

public class Testit {
    private static Buch buch;
    private static int ci;
    private static int ni;
    private static int fi;
    private static int oi;
    private static int ai;

    public static void main(String[]args) {
        Random r = new Random();
        ArrayList<Buch> mBuchListe = new ArrayList();
        String[] GenreListe = new String[0];
        String[] AutorListe = new String[0];
        int[] SeitenanzahlListe = new int[0];
        String[] TitelListe = new String[0];
        String[] JahrListe = new String[0];
        buch = new Buch(GenreListe[ci], AutorListe[ni], SeitenanzahlListe[fi], TitelListe[oi], JahrListe[ai]);
        GenreListe = new String[]{"Danmei", "Fantasy", "Horror", "Detektive"};
        AutorListe = new String[]{"Rou Bao Bu Chi Rou", "Arthur Connan Doyle", "Mo Xiang Tong Xiu", "Cassandra Clare"};
        SeitenanzahlListe = new int[]{300 - 1000};
        TitelListe = new String[]{"The Husky and his white Cat shizun", "Sherlock Holmes", "Mo Dao Zu Shi", "The Mortal Instruments"};
        JahrListe = new String[]{"1990", "2020", "2010", "1850", "1890"};
        for (int i = 1; i <= 100; i++) {

            int ci = r.nextInt(GenreListe.length - 1 - 0) + 0;
            int ni = r.nextInt(AutorListe.length - 1 - 0) + 0;
            int fi = r.nextInt(SeitenanzahlListe.length - 1 - 0) + 0;
            int oi = r.nextInt(TitelListe.length - 1 - 0) + 0;
            int ai = r.nextInt(JahrListe.length - 1 - 0) + 0;
            mBuchListe.add(new Buch(GenreListe[ci], AutorListe[ni], SeitenanzahlListe[fi], TitelListe[oi], JahrListe[ai]));
        }


        Buch buch2 = new Buch("nette", "nackte", 5, "rosa", "Sphinx");
        mBuchListe.add(buch2);
        int maxkatzenalter;
        Regal regal = new Regal(350, "Buxdehude 4, 88732", 8, 5, maxkatzenalter >= 5);
        Regal regal2 = new Regal(400, "FU 3 6969", 10, 8);
        Regal.getInfo();


        for (Buch k : mBuchListe) {
            System.out.println("Das Genre des Buches " + this.Genre + " von dem Autor " + this.Autor + " hat den Namen "
                    + this.Titel + " und ist insgesamt " + this.Seitenanzahl + " lang. Es erschien " + this.Jahr);

            addbuch(k);
        }
        buch.getMaxBuchRegal();
    }

}


