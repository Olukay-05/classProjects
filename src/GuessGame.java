import java.util.Scanner;
public class GuessGame {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);
        System.out.print("Guess your Number: ");
        int number1 = input.nextInt();

        int number2 = 50;

        if (number1 == number2) {
            System.out.print("You are correct!");
            }

        if (number1 > number2) {
            System.out.print("Oops, Better luck next time");
        }

        if (number1 < number2) {
            System.out.print("Oops, Better luck next time");
        }


    }


}

