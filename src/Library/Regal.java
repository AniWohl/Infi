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
        return maxSeiten;
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
        this.maxBuch = maxBuch;  // Use the parameter instead of initializing with new Buch().getSeitenanzahl()
        this.maxSeiten = maxSeiten;  // Initialize the maxSeiten field
        this.buchliste = new ArrayList<>();  // Initialize the buchliste ArrayList
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

    public void getInfo() {
        System.out.println("Ort " + this.Ort + "\nPlatz:" + this.Platz + "\nAnzahl der Regale:" + this.anzahlRegale);
    }

    public void addBuch(Buch buch) {
        if (this.MaxBuchRegal <= buchliste.size()) {
            buchliste.add(buch);
        } else {
            System.out.println("Das Buchregal hält nicht mehr als " + this.MaxBuchRegal + " aus");
        }
    }

    public void getBuch() {
        for (Buch k : buchliste) {
            k.getInfo();
        }
    }
}
