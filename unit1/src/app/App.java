package app;
import java.util.Scanner;


public class App {
    public static void main(String[] args) throws Exception {

        Scanner color = new Scanner(System.in);
        System.out.println("Please enter a color");
        String color2 = color.nextLine();
        System.out.println("You have chosen " + color2 + " as your color");

        Scanner number = new Scanner(System.in);
        System.out.println("Enter a number between 0-9");
        int number2 = number.nextInt();
        System.out.println("The number you have chose is " + number2);

        while (9 > number2) {
            number2 = number2 + 1; 
            
            
            
            
        }

        }



    }
