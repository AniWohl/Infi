package oop;

public class Testit {
    public static void main(String[]args){
        Katze katze = new Katze ();
katze.setAlter(1);
katze.setCharakter("Schmussekater");
katze.setFarbe("Pink mit blauen Streifen");
katze.setOberflaechenbeschaffenheit("flauschig");
katze.setName("Petti");

System.out.println("Meine Katze "+katze.getName() + " ist " +katze.getAlter() + " Jahr alt!");
    }
}
