package Library;

import java.util.ArrayList;
import java.util.Random;
public class Testit {
    public static void main(String[]args){
        Random r =new Random();
        ArrayList<Buch> mBuchListe= new ArrayList();
        Buch buch = new Buch ();
        String[] GenreListe= {"Danmei","Fantasy","Horror","Detektive"};
        String[] AutorListe= {"Rou Bao Bu Chi Rou","Arthur Connan Doyle","Mo Xiang Tong Xiu","Cassandra Clare"};
        int[] SeitenanzahlListe= {300-1000};
        String[] TitelListe= {"The Husky and his white Cat shizun","Sherlock Holmes","Mo Dao Zu Shi","The Mortal Instruments"};
        String[] JahrListe= {"1990","2020","2010","1850","1890"};
        for (int i =1; i<=100; i++) {

            int ci = r.nextInt(GenreListe.length -1 - 0) + 0;
            int ni = r.nextInt(AutorListe.length -1 - 0) + 0;
            int fi = r.nextInt(SeitenanzahlListe.length -1 - 0) + 0;
            int oi = r.nextInt(TitelListe.length -1 - 0) + 0;
            int ai = r.nextInt(JahrListe.length -1 - 0) + 0;
            mBuchListe.add(new Buch(GenreListe[ci],AutorListe[ni],SeitenanzahlListe[fi],TitelListe[oi],JahrListe[ai]));
        }
        Buch.setSeitenanzahl(300);
        Buch.setGenre("Danmei");
        Buch.setTitel("The Husky and his white cat shizun");
        Buch.setAutor("Rou Bao Bu Chi Rou");
        Buch.setJahr("2022");

        Buch buch2 = new Buch ("nette","nackte",5,"rosa","Sphinx");
        mBuchListe.add(buch2);
        Regal regal = new Regal ( 350, "Buxdehude 4, 88732", 8, 5, maxkatzenalter >=5);
        Regal regal2 = new Regal ( 400, "FU 3 6969", 10, 8);
        Regal.getInfo();


        for(Buch k:mBuchListe){
            System.out.println("Das Genre des Buches "+ this.Genre + " von dem Autor " + this.Autor + " hat den Namen "
                    + this.Titel + " und ist insgesamt " + this.Seitenanzahl + " lang. Es erschien " + this.Jahr);

            Buch.addbuch(k);
        }
        buch.getMaxBuchRegal();
    }

}


