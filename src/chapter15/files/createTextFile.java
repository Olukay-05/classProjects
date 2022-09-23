package chapter15.files;
import java.io.FileNotFoundException;
import java.lang.SecurityException;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;
import java.util.Scanner;


public class createTextFile {

    public static void main(String[] args) {

        try (Formatter output = new Formatter("clients.txt") ) {
            Scanner input = new Scanner(System.in);
            System.out.printf("%s%n%s%n? ",
                    "Enter account number, first name, last name and balance.",
                    "Enter end-of-file indicator to end input.");

            output.format("%d %s %s %.2f%n", input.nextInt(),
                    input.next(), input.next(), input.nextDouble());


            while (input.hasNext()) {
                try {


                }
                catch (NoSuchElementException elementException) {
                    System.err.println("Invalid input. Please try again.");
                    input.nextLine();
                }

                System.out.print("? ");
            }
        }
        catch (SecurityException | FileNotFoundException |
               FormatterClosedException e) {
            e.printStackTrace();
        }
    }

}
