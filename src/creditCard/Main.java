package creditCard;

import java.util.Scanner;



public class Main {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your card number: ");

        long number = scanner.nextLong();

        if (CreditCard.isValid(number))

            System.out.println(number + " is valid");
        else
            System.out.println(number + " is invalid");
    }
}
