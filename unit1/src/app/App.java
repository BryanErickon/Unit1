package app;
import java.util.Scanner;



public class App {
    public static void main(String[] args) throws Exception {

Scanner password = new Scanner(System.in);
System.out.println("What's the password?");
String input = password.nextLine();
String correct = "Tacos";
int fail = 0;

while (fail <=3) {
if (input.equals(correct)) {
    System.out.println("Password accepted");
} else { fail++;
    System.out.println("Wrong password");
}

} 
    }











}
    






    








    

        

        
           
            
            

            

