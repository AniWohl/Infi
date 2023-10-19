package at.woa;

import java.util.Random;

public class Würfelspiel {
    public static void main(String[] args) {
        Random random = new Random();
        int winsOfPlayer=0;
        int winsOfComputer=0;
        int amountOfDraws=0;

        for(int i =0; i<6; i++) {
            int randomPlayer = random.nextInt(6) + 1;
            int RandomComputer = random.nextInt(6) + 1;

            if (randomPlayer>RandomComputer) {
               winsOfPlayer++;
            } else if (randomPlayer<RandomComputer) {
                winsOfComputer++;
            }
            else  {
                amountOfDraws++;
    }
            System.out.println("Computer " + winsOfComputer + " Player " + winsOfPlayer + " Draw " + amountOfDraws);
            if ( winsOfPlayer>winsOfComputer) {
                System.out.println("player wins");
            } else   if ( winsOfPlayer<winsOfComputer) {
                System.out.println("computer wins");
            }
            else {
                System.out.println("no one");
            }
        }





    }
}


