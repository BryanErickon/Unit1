package app;

import java.util.Scanner;
import java.util.Random;

public class App {

    public static void main(String[] args) throws Exception {
        
        printFavMovie("Monty Python", "Austin Powers", "Star Wars 6", "Home Alone", "Christmas Vacation");
        int myInt = add(2,4);
        System.out.println(myInt);
        System.out.println(name());

    }
    public static void printFavMovie(String a, String b, String c, String d, String e ){
        System.out.println(a + b + c + d + e);


    }
    public static int add(int f, int g){
        return (f + g);
    }
    public static String name(){
        return ("Bryan");
    }




}



        
