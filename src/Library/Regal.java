package Library;

import java.util.ArrayList;

public class Regal {
    private int Platz;
    private String Ort;
    private int anzahlRegale;
    private int maxBuch;

    private int maxSeiten;
    private ArrayList<Buch> buchliste;
    private int MaxBuchRegal;

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
        this.Platz = Platz;
        this.Ort = Ort;
        this.anzahlRegale = anzahlRegale;
        this.maxBuch = new ArrayList<>();
        this.maxBuchRegal = maxBuchRegal;
    }

    public int getPlatz() {
        return Platz;
    }

    public void setPlatz(int Platz) {
        this.Platz = Platz;
    }

    public String getOrt() {
        return Ort;
    }

    public void setOrt(String Ort) {
        this.Ort = Ort;
    }

    public int getanzahlRegale() {
        return anzahlRegale;
    }

    public void setanzahlRegale(int anzahlRegale) {
        this.anzahlRegale = anzahlRegale;
    }

    public void getInfo () {
        System.out.println("Ort " + this.adresse + "\nPlatz:" + this.flaeche + "\nAnzahl der Regale:" + this.anzahlZimmer);
    }

    public void addBuch(Buch buch) {
        if (Buchliste.size() >= this.setMaxBuchRegal()) {
            System.out.println("Das Buchregal hält nicht mehr als " + this.maxkatzenimhaus + " aus");
        } else {
            Buchliste.add(buch);
        }
    }

    public void getBuch() {
        for (Buch k : buchliste) {
            k.getInfo();
        }
    }
}
