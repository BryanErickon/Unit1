package app;

import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {

         int target = 58;
        boolean isFinished = false;
        while (isFinished == false) {

        Scanner number = new Scanner(System.in);
        System.out.println("Please guess a number between 0 and 100");
        int input = number.nextInt();
        number.nextLine();
       

        if (input == target){
            System.out.println("Correct");
            isFinished = true;
        } else  {
            if (input > target) {
                System.out.println("Too high");
            }
                else {
                    System.out.println("Too low");
                }
                
             
            } 
            
            }
        }

}
