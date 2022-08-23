package javaAssignments;

import java.util.Scanner;

public class MyNumbers {

    public static void main(String[] args) {
        int lowestNumber = 0;
        int highestNumber = 50;

        Scanner input = new Scanner(System.in);
        for (int i = 0; i <= 5; i++) {

            System.out.printf("Enter input %d%n", i);
            int number = input.nextInt();

            if (number > highestNumber) {
                highestNumber = number;
            } else if (number < lowestNumber)
                lowestNumber = number;
            System.out.printf(" The largest number is %d%nThe lowest number is %d%n", highestNumber, lowestNumber);
        }

//        System.out.print("Enter your number: ");
//        int number1 = input.nextInt();
//
//        System.out.print("Enter your 2nd Number: ");
//        int number2 = input.nextInt();
//
//        System.out.print("Enter your 3rd Number: ");
//        int number3 = input.nextInt();
//
//        System.out.print("Enter your 4th Number: ");
//        int number4 = input.nextInt();
//
//        System.out.print("Enter your 5th Number: ");
//        int number5 = input.nextInt();
//


    }
}
