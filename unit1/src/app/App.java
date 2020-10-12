package app;

import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {

Scanner input1 = new Scanner(System.in);
System.out.println("Please enter a number");
int number1 = input1.nextInt();
Scanner input2 = new Scanner(System.in);
System.out.println("Please enter another number");
int number2 = input2.nextInt();

if (number1 < number2){
for (number1++; number1 <= number2; number1++){
    if (number1 %2 ==0){
        System.out.println(number1);
    }else {

    }
}
}else {
    for (number1--; number1 >= number2; number1--){
        if (number1 %2 == 0){
            System.out.println(number1);
        }
    }
}
    








}














    }

        
