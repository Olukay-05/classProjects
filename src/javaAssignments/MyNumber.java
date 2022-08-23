package javaAssignments;

import java.util.Scanner;

public class MyNumber {

    public static void main(String[] args) {






        Scanner input = new Scanner(System.in);



        System.out.println("Enter Number: ");
        int userInput = input.nextInt();
        int largestNumber = userInput;
        int lowestNumber = userInput;




        int count = 1;

               while(count < 5){

                 //  System.out.println("Enter number%d: ", count +1;
                   userInput = input.nextInt();


                   if (userInput > largestNumber){
                       largestNumber = userInput;
                   }
                   if (userInput < lowestNumber){
                       largestNumber = userInput;

                   }
                   count = count +1;
               }

        System.out.printf("The largest number is %d", largestNumber);
        System.out.printf("The lowest number is %d", lowestNumber);
    }
}
