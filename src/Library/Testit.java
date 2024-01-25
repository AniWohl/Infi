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

        Buch buch = new Buch("nette", "nackte", 5, "rosa", "Sphinx");
        mBuchListe.add(buch);

        Regal regal = new Regal(400, "FU 3 6969", 10, 8, 100); // Assuming MaxBuchRegal is initialized to 100
        regal.getInfo();

        for (Buch k : mBuchListe) {
            k.getInfo(); // Use the getInfo method to print information about each book
            regal.addBuch(k);
        }

        regal.getBuch(); // Print information about books in the bookshelf

        int maxBuchRegal = regal.getMaxBuchRegal();
        System.out.println("Maximale Anzahl von Büchern im Regal: " + maxBuchRegal);
    }
}
