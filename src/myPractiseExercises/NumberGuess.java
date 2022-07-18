package myPractiseExercises;

import java.util.Scanner;

public class NumberGuess {

    public static void main(String[] args) {

    int myNumber = 50;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter you guess:   ");


        while (true) {
            int guessedNumber = input.nextInt();

            if (guessedNumber == myNumber) {
                System.out.println("Your guess is right!!!");
                    } else if (guessedNumber < myNumber) {
                            System.out.println("Your guess is lower, try again!");
                    } else {
                            System.out.println("Your guess is high, try again!");
            }

        }
    }
}
