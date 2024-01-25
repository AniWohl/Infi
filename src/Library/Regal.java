package Library;

import java.util.ArrayList;

public class Regal {
    private int platz;
    private String ort;
    private int anzahlRegale;
    private int maxBuch;
    private int maxSeiten;
    private ArrayList<Buch> buchliste;
    private int maxBuchRegal;

    public Regal(int platz, String ort, int anzahlRegale, int maxBuch, int maxSeiten) {
        this.platz = platz;
        this.ort = ort;
        this.anzahlRegale = anzahlRegale;
        this.maxBuch = maxBuch;
        this.maxSeiten = maxSeiten;
        this.buchliste = new ArrayList<>();
    }

    public int getPlatz() {
        return platz;
    }

    public void setPlatz(int platz) {
        this.platz = platz;
    }

    public String getOrt() {
        return ort;
    }

    public void setOrt(String ort) {
        this.ort = ort;
    }

    public int getAnzahlRegale() {
        return anzahlRegale;
    }

    public void setAnzahlRegale(int anzahlRegale) {
        this.anzahlRegale = anzahlRegale;
    }

    public int getMaxBuchRegal() {
        return maxBuchRegal;
    }

    public int getMaxSeiten() {
        return maxSeiten;
    }

    public void setMaxBuchRegal(int maxBuchRegal) {
        this.maxBuchRegal = maxBuchRegal;
    }

    public void setMaxSeiten(int maxSeiten) {
        this.maxSeiten = maxSeiten;
    }

    public void getInfo() {
        System.out.println("Ort " + this.ort + "\nPlatz:" + this.platz + "\nAnzahl der Regale:" + this.anzahlRegale);
    }

    public void addBuch(Buch buch) {
        int maxBuchRegalRange = 40; // Ändere dies auf die gewünschte maximale Anzahl
        int minBuchRegalRange = 10; // Ändere dies auf die gewünschte minimale Anzahl

        if (buchliste.size() < this.maxBuchRegal && this.platz >= 100 && this.platz <= 400) {
            buchliste.add(buch);
            if (buchliste.size() == maxBuchRegalRange) {
                System.out.println("Maximale Anzahl von Büchern im Regal erreicht: " + maxBuchRegalRange);
            }
        } else {
            System.out.println("Das Buchregal hält nicht mehr als " + this.maxBuchRegal + " aus " +
                    "und der Platz im Regal muss zwischen 100 und 400 liegen.");
        }
    }


    public void getBuch() {
        for (Buch k : buchliste) {
            k.getInfo();
        }
    }
}
