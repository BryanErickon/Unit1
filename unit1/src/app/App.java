package app;
import java.util.Scanner;




public class App {
    public static void main(String[] args) throws Exception {
      
      Scanner noun = new Scanner(System.in);

      System.out.println("Please enter a proper noun");
      String noun2 = noun.nextLine();
      System.out.println("this is a " + noun2);

      Scanner adj = new Scanner(System.in);
      System.out.println("Please enter an adjective");
      String adj2 = adj.nextLine();
      System.out.println("the " + noun2 + " is " + adj2);

      Scanner place = new Scanner(System.in);
      System.out.println("enter a place");
      String place2 = place.nextLine();
      System.out.println("Your place is " + place2);

      Scanner verb = new Scanner(System.in);
      System.out.println("Please enter a past tense verb");
      String verb2 = verb.nextLine();
      System.out.println("Your verb is " + verb2);

      Scanner food = new Scanner(System.in);
      System.out.println("Please enter a food");
      String food2 = food.nextLine();
      System.out.println("Your food is " + food2);

      System.out.println("One day, a " + adj2 + " " + noun2 + " " + "in " + place2 + " " + verb2 + " some " +  food2);






    }
}