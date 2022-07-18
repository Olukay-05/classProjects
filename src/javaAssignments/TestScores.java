package javaAssignments;

import java.util.Scanner;
public class TestScores {

    public static void main(String[] args) {

        testResult();

    }


    public static void testResult() {


        Scanner input = new Scanner(System.in);



        int counter = 1;
        while (counter <= 6) {
            System.out.println("Enter your Test Score:  ");
            int gradeRecorder = input.nextInt();


            switch (gradeRecorder) {
                case 90:
                    System.out.println("A");
                    break;
                case 60:
                    System.out.println("B");
                    break;
                case 50:
                    System.out.println("C");
                    break;
                case 40:
                    System.out.println("D");
                    break;
                case 30:
                    System.out.println("E");
                    break;
                case 20:
                    System.out.println("F");
                    break;

            }

            counter++;
        }


    }


}