package app;

import java.util.Scanner;
import java.util.Random;

public class App {

    public static void main(String[] args) throws Exception {

        Random spin = new Random();
        int betNum = 10;
        int resultNum = spin.nextInt(37);
        int betSum = 100;
        String insideBet = "inside";
        Scanner inorout = new Scanner(System.in);
        String check = "yes";

        while (betNum > 0) {
            System.out.println("Would you like to make an inside bet or an outside bet?");
            String inorout1 = inorout.nextLine();
            if (inorout1.equals(insideBet)) {
                betNum--;
                Scanner chosenNum = new Scanner(System.in);
                System.out.println("What number so you want to bet on?");
                String chosenNum1 = chosenNum.nextLine();

                System.out.println("How much do you want to bet on " + chosenNum1);
                Scanner bet = new Scanner(System.in);
                String betAmount1 = bet.nextLine();
                System.out.println("You have bet $" + betAmount1 + " on " + chosenNum1);

                System.out.println("You have " + betNum + " bets remaining. Would you like to bet again?");
                Scanner again = new Scanner(System.in);
                String again1 = again.nextLine();

            }
        }
    }
}
