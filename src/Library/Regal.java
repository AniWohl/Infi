package Library;

import java.util.ArrayList;

public class Regal {
    private int Platz;
    private String Ort;
    private int anzahlRegale;
    private int maxBuch;

    private int maxkatzenalter;
    private ArrayList<Katze> katzenliste;

    public int getMaxkatzenimhaus() {
        return maxkatzenimhaus;
    }
    public int getMaxkatzenalter() {
        return maxkatzenalter;
    }

    public void setMaxkatzenimhaus(int maxkatzenimhaus) {
        this.maxkatzenimhaus = maxkatzenimhaus;

    }
    public void setmaxkatzenalter(int maxkatzenalter) {
        this.maxkatzenalter = maxkatzenalter;
    }

    public Haus(int flaeche, String adresse, int anzahlZimmer, int maxkatzenimhaus) {
        this.flaeche = flaeche;
        this.adresse = adresse;
        this.anzahlZimmer = anzahlZimmer;
        this.katzenliste = new ArrayList<>();
        this.maxkatzenimhaus = maxkatzenimhaus;
    }

    public int getFlaeche() {
        return flaeche;
    }

    public void setFlaeche(int flaeche) {
        this.flaeche = flaeche;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public int getAnzahlZimmer() {
        return anzahlZimmer;
    }

    public void setAnzahlZimmer(int anzahlZimmer) {
        this.anzahlZimmer = anzahlZimmer;
    }

    public void getInfo () {
        System.out.println("Adresse " + this.adresse + "\nFlaeche:" + this.flaeche + "\nAnzahl der Zimmer:" + this.anzahlZimmer);
    }

    public void addKatze(Katze katze) { //
        if (katzenliste.size() >= this.maxkatzenimhaus) {
            System.out.println("Der/Die ChefIn will nicht mehr Katzen als " + this.maxkatzenimhaus + " im Haus!!");
        } else {
            katzenliste.add(katze);
        }

    } public void getKatzenImHaus() {
        for (Katze k : katzenliste) {
            k.getInfo();
        }
    }
}
