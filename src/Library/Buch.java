package Library;

import java.util.ArrayList;

public class Buch {
    private String Genre;
    private String Autor;
    private int Seitenanzahl;
    private String Titel;
    private String Jahr;

    public Buch(String titel, String autor, int seiten, String genre, String jahr) {
        this.Titel = titel;
        this.Autor = autor;
        this.Seitenanzahl = seiten;
        this.Genre = genre;
        this.Jahr = jahr;
    }

    public void addbuch(Buch buch, ArrayList<Buch> buchliste) {
        buchliste.add(buch);
    }

    public String getGenre() {
        return Genre;
    }

    public void setGenre(String genre) {
        this.Genre = genre;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String autor) {
        this.Autor = autor;
    }

    public int getSeitenanzahl() {
        return Seitenanzahl;
    }

    public void setSeitenanzahl(int seitenanzahl) {
        this.Seitenanzahl = seitenanzahl;
    }

    public String getTitel() {
        return Titel;
    }

    public void setTitel(String titel) {
        this.Titel = titel;
    }

    public String getJahr() {
        return Jahr;
    }

    public void setJahr(String jahr) {
        this.Jahr = jahr;
    }

    public void getInfo() {
        System.out.println("Das Genre des Buches " + this.Genre + " von dem Autor " + this.Autor +
                " hat den Namen " + this.Titel + " und ist insgesamt " + this.Seitenanzahl +
                " lang. Es erschien " + this.Jahr);
    }

    public int getMaxBuchRegal() {
        return 0;
    }
}
