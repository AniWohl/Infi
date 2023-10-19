package at.woa;

import java.util.Random;

public class e {
    public static void main(String[] args) {
        int summe = 0;
        boolean isFinished = true;
        Random random = new Random();

        while (isFinished) {
            int i = random.nextInt(21) + 10;
            System.out.println("Generierte Zufallszahl: " + i);
            summe += i;

            if (i == 15 || i == 25) {
                isFinished = false;
            }
        }

        System.out.println("Die Summe der vorherigen Zufallszahlen ist: " + summe);
    }
}
