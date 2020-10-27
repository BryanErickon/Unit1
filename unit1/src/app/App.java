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
        String check = "yes";
        String color[] = { "green", "red", "black", "red", "black", "red", "black", "red", "black", "red", "black",
                "black", "red", "black", "red", "black", "red", "black", "red", "red", "black", "red", "black", "red",
                "black", "red", "black", "red", "black", "black", "red", "black", "red", "black", "red", "black",
                "red" };
        boolean a = false;
        boolean b = true;

        while (betNum > 0 && a == true || a == false && b == true ) {
            
            Scanner inorout = new Scanner(System.in);
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
                
                 if (!(again1.equals(check))){
                     b = false;
                 }else {
                     a = true;
                 }
            } else {
                betNum--;
                Scanner broe = new Scanner(System.in);
                System.out.println("Would you like to make a bet on black, red, odd, or even?");
                String broe1 = broe.nextLine();
                String black = "black";
                String red = "red";
                String odd = "odd";
                String even = "even";
                Scanner broebet = new Scanner(System.in);
                System.out.println("How much do you want to bet?");
                String broebet1 = broebet.nextLine();

                if (broe1.equals(black)) {
                    System.out.println("You have bet " + broebet1 + " on black");

                } else if (broe1.equals(red)) {
                    System.out.println("You have bet " + broebet1 + " on red");

                } else if (broe1.equals(odd)) {
                    System.out.println("You have bet " + broebet1 + " on odd");

                } else if (broe.equals(even)) {
                    System.out.println("You have bet " + broebet1 + " on even");

                }
                System.out.println("You have " + betNum + " bets remaining. Would you like to bet again?");
                Scanner again = new Scanner(System.in);
                String again1 = again.nextLine();
                 a = true;
                 if (!(again1.equals(check))){
                     b = false;
                 }else {
                     a = true;
                 }

            }
        }
    }
}
