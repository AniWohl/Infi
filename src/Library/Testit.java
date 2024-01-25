package Library;

import java.util.ArrayList;
import java.util.Random;

public class Testit {
    private static int ci;
    private static int ni;
    private static int fi;
    private static int oi;
    private static int ai;

    public static void main(String[] args) {
        Random r = new Random();
        ArrayList<Buch> mBuchListe = new ArrayList<>();
        String[] GenreListe = {"Danmei", "Fantasy", "Horror", "Detektive"};
        String[] AutorListe = {"Rou Bao Bu Chi Rou", "Arthur Connan Doyle", "Mo Xiang Tong Xiu", "Cassandra Clare"};
        int[] SeitenanzahlListe = {300, 1000};
        String[] TitelListe = {"The Husky and his white Cat shizun", "Sherlock Holmes", "Mo Dao Zu Shi", "The Mortal Instruments"};
        String[] JahrListe = {"1990", "2020", "2010", "1850", "1890"};

        for (int i = 1; i <= 100; i++) {
            int ci = r.nextInt(GenreListe.length);
            int ni = r.nextInt(AutorListe.length);
            int fi = r.nextInt(SeitenanzahlListe[1] - SeitenanzahlListe[0] + 1) + SeitenanzahlListe[0];
            int oi = r.nextInt(TitelListe.length);
            int ai = r.nextInt(JahrListe.length);
            Buch newBuch = new Buch(TitelListe[oi], AutorListe[ni], fi, GenreListe[ci], JahrListe[ai]);
            mBuchListe.add(newBuch);
        }

        Buch buch = new Buch("MDZS", "STH", 3, "Fanfiction", "1900", maxBuchRegal: 8);
        mBuchListe.add(buch);

        Regal regal = new Regal(400, "FU 3 6969", 10, 8, 100);
        regal.getInfo();

        for (Buch k : mBuchListe) {
            k.getInfo();
            regal.addBuch(k);
        }

        int maxBuchRegal = regal.getMaxBuchRegal();
        System.out.println("Maximale Anzahl von Büchern im Regal: " + maxBuchRegal);
    }
}
