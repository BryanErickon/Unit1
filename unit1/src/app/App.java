package app;

import jdk.dynalink.DynamicLinker;

public class App {
    public static void main(String[] args) throws Exception {
        String person1 = "Dylan";
        String person2 = "Mario";
        String verb1 = "swim";
        String verb2 = "watch";
        String verb3 = "touching";
        String food = "Haggis";
        String dayOfWeek = "Monday";
        String place1 = "North Korea";
        String place2 = "Japan";
        String adjective1 = "Jumping";
        String adjective2 = "driving";

        System.out.println(person1 + " " + "is a programmer who likes to " + verb1 +".");
        System.out.println("Every " + dayOfWeek + " they make a " + adjective1 + " " + food + " " + "for breakfast and " + verb2 + " " + "at " + place1 + " " + "with" + " " + person2 + ".");
        System.out.println("Sometimes, they go to the " + adjective2 + " " + place2 + " " + "with" + person2 + " so that they can" + " " + verb3 + " " + "together.");


        

    }
}