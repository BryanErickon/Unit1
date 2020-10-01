package app;

import java.util.Scanner;


public class App {
    public static void main(String[] args) throws Exception {

    Scanner input = new Scanner(System.in);
    System.out.println("Please enter a number between 1-5 for a fact about Garter Snakes");
    int userInput = input.nextInt();

    if (userInput == 1) {
        System.out.println("Garter snakes belong to the Genus Thamnophis");
    } else if (userInput == 2) {
        System.out.println("Garter snakes can be 46 to 137 cm in length");
    } else if (userInput == 3) {
          System.out.println("Garter snakes are closely related to the genus Nerodia (water snakes)");
    } else if (userInput == 4) {
          System.out.println("Garter snakes have complex systems of pheromonal communication");
    } else if (userInput == 5) {
        System.out.println("Garter snakes, like all snakes, are carnivorous.");
    }
    else {
        System.out.println("Error, the number you have chose is not in the specified range");
  
    }
    }
}





    








    

        

        
           
            
            

            

