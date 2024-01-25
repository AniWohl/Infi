package Library;

import java.util.ArrayList;
import java.util.Random;

public class Testit {
    public static void main(String[] args) {
        Random r = new Random();
        ArrayList<Buch> mBuchListe = new ArrayList<>();
        String[] GenreListe = {"Danmei", "Fantasy", "Horror", "Detektive"};
        String[] AutorListe = {"Rou Bao Bu Chi Rou", "Arthur Connan Doyle", "Mo Xiang Tong Xiu", "Cassandra Clare"};
        int[] SeitenanzahlListe = {300, 1000}; // Assuming a range of 300 to 1000 pages
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

        Buch buch = new Buch("MDZS", "STH", 3, "Fanfiction", "1900");
        Regal regal = new Regal(400, "FU 3 6969", 10, 8, 100);
        regal.getInfo();

        if (mBuchListe.size() < regal.getMaxBuchRegal()) {
            mBuchListe.add(buch);
            System.out.println("Buch hinzugefügt: " + buch.getTitel());
        } else {
            System.out.println("Das Buchregal hält nicht mehr als " + regal.getMaxBuchRegal() + " aus");
        }

        for (Buch k : mBuchListe) {
            k.getInfo();
            regal.addBuch(k);
        }

        regal.getBuch();
    }
}
