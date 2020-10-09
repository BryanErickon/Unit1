package app;
import java.util.Scanner;



public class App {
    private static int input2;
    private static int input3;

    public static void main(String[] args) throws Exception {

        Scanner number = new Scanner(System.in);
        System.out.println("Please enter a number between 0 and 100");
        int input = number.nextInt();
    
        if (input == 59) {
            System.out.println("Correct!");
        } else { 
            do {
                if (input <= 58 || input2 <= 58 || input3 <=58) {
                    System.out.println("Too low, try again");
                      int input2 = number.nextInt();
                } else if (input >= 60 || input2 >= 60 || input3 >= 60) {
                    System.out.println("Too high, try again");
                    int input3 = number.nextInt();
                } else if (input2 == 59 || input3 == 59) {
                    System.out.println("Correct, you did it!");
                }

            } while ( input2 < 59 || input3 > 59);
        }
            
        







    }
}


    

















    






    

    






    

        

        
           
            
            

            

