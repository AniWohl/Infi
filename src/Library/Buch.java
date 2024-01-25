package Library;

public class Buch {
        private String Genre;
        private String Autor;
        private int Seitenanzahl;
        private String Titel;
        private String Jahr;


    public Buch(String titel, String autor, int seiten, String genre, String s) {
    }

    public Buch(String titel, String autor, int seiten, String genre, int jahr) {
        this.Genre = Genre;
        this.Autor = Autor;
        this.Seitenanzahl = Seitenanzahl;
        this.Titel = Titel;
        this.Jahr = Jahr;
    }

    public static void addbuch(Buch k) {
    }

    public String getGenre() {
        return Genre;
    }

    public void setGenre(String Genre) {
        this.Genre = Genre;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    public int getSeitenanzahl() {
        return Seitenanzahl;
    }

    public void setSeitenanzahl(int Seitenanzahl) {
        this.Seitenanzahl = Seitenanzahl;
    }

    public String getTitel() {
        return Titel;
    }

    public void setTitel(String Titel) {
        this.Titel = Titel;
    }

    public String getJahr() {
        return Jahr;
    }

    public void setJahr(String Jahr) {
        this.Jahr = Jahr;
    }

    public void getInfo() {
        System.out.println("Das Genre des Buches "+ this.Genre + " von dem Autor " + this.Autor + " hat den Namen "
                + this.Titel + " und ist insgesamt " + this.Seitenanzahl + " lang. Es erschien " + this.Jahr);
    }

    public void getMaxBuchRegal() {
    }
}

