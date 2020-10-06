package app;
import java.util.Scanner;



public class App {
    public static void main(String[] args) throws Exception {

Scanner password = new Scanner(System.in);
System.out.println("What's the password?");
String input = password.nextLine();
String correct = "Tacos";
int failCount = 2;


if (input.equals(correct)) {
    System.out.println("Password accepted");
} else {
    for (int fail = 0; fail <= 2; fail++) {
        failCount--;
        System.out.println("You have gotten the password wrong, you have " + failCount + " tries left");
    Scanner password2 = new Scanner(System.in);
        System.out.println("Please try again");
        String input2 = password2.nextLine();
        if (input2.equals(correct)) {
         System.out.println("Password accepted");
    }
}
    



    }



}
}


    












    






    








    

        

        
           
            
            

            

