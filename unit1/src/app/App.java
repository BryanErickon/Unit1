package app;
import java.util.Scanner;



public class App {
    private static int input2;
    private static int input3;

    public static void main(String[] args) throws Exception {

        Scanner number = new Scanner(System.in);
        System.out.println("Please enter a number between 0 and 100");
        int input = number.nextInt();
        int target = 58;

        if (input == target) {
             System.out.println("Correct");
        } else if (input < target) {
            System.out.println("Too low, try again");
        } else if (input > target) {
            System.out.println("Too high, try again");
        }
        
            
        







    }
}


    

















    






    

    






    

        

        
           
            
            

            

