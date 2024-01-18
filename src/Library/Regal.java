package Library;

import java.util.ArrayList;

public class Regal {
    private int Platz;
    private String Ort;
    private int anzahlRegale;
    private int maxBuch;

    private int maxSeiten;
    private ArrayList<Buch> buchliste;

    public int getMaxBuchRegal() {
        return MaxBuchRegal;
    }
    public int getMaxSeiten() {
        return getMaxSeiten();
    }

    public void setMaxBuchRegal(int MaxBuchRegal) {
        this.MaxBuchRegal = MaxBuchRegal;

    }
    public void setMaxSeiten(int maxSeiten) {
        this.maxSeiten = maxSeiten;
    }

    public Regal(int Platz, String Ort, int anzahlRegale, int maxBuch, int maxSeiten) {
        this.Platz = PLatz;
        this.Ort = Ort;
        this.anzahlRegale = anzahlRegale;
        this.maxBuch = new ArrayList<>();
        this.maxBuch = maxkatzenimhaus;
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
