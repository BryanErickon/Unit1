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
        boolean c = true;

        while (c == true){
        while (betNum > 0 && a == true || a == false && b == true ) {
            // testline 
            System.out.println(resultNum + " " + color[resultNum]);
            // end test line
            System.out.println("You have $" + betSum);
            Scanner inorout = new Scanner(System.in);
            System.out.println("Would you like to make an inside bet or an outside bet?");
            String inorout1 = inorout.nextLine();
            if (inorout1.equals(insideBet)) {
                betNum--;
                Scanner chosenNum = new Scanner(System.in);
                System.out.println("What number so you want to bet on?");
                int chosenNum1 = chosenNum.nextInt();

                System.out.println("How much do you want to bet on " + chosenNum1);
                Scanner bet = new Scanner(System.in);
                int betAmount1 = bet.nextInt();
                System.out.println("You have bet $" + betAmount1 + " on " + chosenNum1);
                
                // if too high a bet is made
                if (betAmount1 > betSum){
                    c = false;
                }
                if (chosenNum1 == resultNum){
                   betSum = betAmount1 * 35 + betSum;
                   System.out.println("$" + betSum + " left");
                }else {
                 betSum = betSum - betAmount1;
                 System.out.println("$" + betSum + " left");
                }

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
                String green = "green";
                Scanner broebet = new Scanner(System.in);
                System.out.println("How much do you want to bet?");
                int broebet1 = broebet.nextInt();
                System.out.println("You have bet $" + broebet1 );
                // if they make too high of a bet
                if (broebet1 > betSum){
                    c = false;
                }
                // if black is chosen
                if (broe1.equals(black) && broe1.equals(color[resultNum])) {
                        betSum = broebet1 * 2 + betSum;
                        System.out.println("$" + betSum + " left");
                    } // if red is chosen
                    else if (broe1.equals(red) && broe1.equals(color[resultNum])){
                        betSum = broebet1 * 2 + betSum;
                        System.out.println("$" + betSum + " left");
                    } // if odd is chosen
                    else if (broe1.equals(odd) && resultNum %2 != 0){
                         betSum = broebet1 * 2 + betSum;
                        System.out.println("$" + betSum + " left");
                    } // if even is chosen
                    else if (broe1.equals(even) && resultNum %2 == 0){
                        betSum = broebet1 * 2 + betSum;
                        System.out.println("$" + betSum + " left");
                    } else if (color[resultNum].equals(green)){
                        betSum = betSum - broebet1;
                    }
                    else {
                        betSum = betSum - broebet1;
                        System.out.println("$" + betSum + " left");
                    }
                     System.out.println("You have " + betNum + " bets remaining. Would you like to bet again?");
                Scanner again = new Scanner(System.in);
                String again1 = again.nextLine();
                 if (!(again1.equals(check))){
                     b = false;
                 }else {
                     a = true;
                 }
                } System.out.println("The number that was chosen was " + resultNum + " " + color[resultNum]);
                System.out.println("Would you like to play again?");
                Scanner playAgain = new Scanner(System.in);
                String playAgain1 = playAgain.nextLine();
               if (!(playAgain1.equals(check))){
                   c = false;
               }

            } 
        } System.out.println("You have $" + betSum + " left");
}
}
                    





    

