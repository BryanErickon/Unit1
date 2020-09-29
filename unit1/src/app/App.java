package app;

import java.util.Scanner;


public class App {
    public static void main(String[] args) throws Exception {



        int score = 0;

        Scanner q1 =  new Scanner(System.in);
        System.out.println("How many states are there?");
        String input1 = q1.nextLine();
        String answer1 = "fifty";
        
    if (input1.equals(answer1)){
        score++;
        System.out.println("You are correct");
    }
    else {
     System.out.println("You are wrong");
    }

    Scanner q2 = new Scanner(System.in);
    System.out.println("What is the chemical formula for salt?");
    String input2 = q2.nextLine();
    String answer2 = "NaCl";

    if (input2.equals(answer2)){
        score++;
        System.out.println("That is right");
    }
    else {
        System.out.println("That is wrong");
    }

    Scanner q3 = new Scanner(System.in);
    System.out.println("What is the class of Star Destroyers that the Republic used?");
    String input3 = q3.nextLine();
    String answer3 = "Venator class";

    if (input3.equals(answer3)){
        score++;
        System.out.println("You are a real jedi");
    }
    else {
        System.out.println("You are a sith imposter");
    }

    Scanner q4 = new Scanner(System.in);
    System.out.println("Is Lego Star Wars the Complete Saga the best game of all time?");
    String input4 = q4.nextLine();
    String answer4 = "Yes";
    if (input4.equals(answer4)){
        score++;
        System.out.println("That is the right answer");


    }
    else {
        System.out.println("You are wrong");
    }

    Scanner q5 = new Scanner(System.in);
    System.out.println("Is steak good?");
    String input5 = q5.nextLine();
    String answer5 = "Yes";

    if (input5.equals(answer5)){
        score++;
        System.out.println("You are right");
    }
    else {
        System.out.println("That is wrong");
    }

    
    if (score == 5){
        System.out.println("You got 5/5");
    }
    if (score == 4){
        System.out.println("You got 4/5");
    }
    if (score == 3){
        System.out.println("You got 3/5");
    }
    if (score == 2){
        System.out.println("You got 2/5");
    }
    if (score == 1){
        System.out.println("You got 1/5");
    }
    if (score == 0){
        System.out.println("You got 0/5");
    }
}
}






    








    

        

        
           
            
            

            

            
            
            
            
        

        



    
