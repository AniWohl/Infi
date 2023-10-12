package at.woa;

import java.awt.*;
import java.sql.SQLOutput;
import java.util.Random;

public class h {
    public static void main(String[] args) {
        // Erstelle eine Zufallszahl zwischen 0 und 100
        Random random = new Random();
        int randomNumber = random.nextInt(100);
        System.out.println(int.class);

        // Gib die Zufallszahl aus
        System.out.println(randomNumber);

        // Wenn die Zahl kleiner ist als 20  gib aus "Mini"

        if (randomNumber<20){
            System.out.println("mini");
        }
        if ((randomNumber > 20 )&& (randomNumber < 50)) {
            System.out.println("Medium");
        }
        if (randomNumber>50) {
            System.out.println("large");
        }

        // Wenn die Zahl zw. 20 und 50 ist gib aus "Medium"
        // Wenn die Zahl größer als 50 ist gib aus "Large"


    }
}
