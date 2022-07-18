package myPractiseExercises;


import java.util.Scanner;

public class OddNumbers {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Enter an Integer:  ");
        int N = scanner.nextInt();
        if (N == (2 * N) + 1){
            System.out.println("Number is Odd");
        } else {
            System.out.println("Number is Even");
        }

    }

}
