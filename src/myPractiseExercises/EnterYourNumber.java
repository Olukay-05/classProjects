package myPractiseExercises;

import java.util.Scanner;

public class EnterYourNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter 0 or 1:  ");
        int number1 = input.nextInt();

        if(number1 == 0){
                System.out.println("1");
            } else if (number1 == 1) {
                System.out.println("0");
        }
    }
}