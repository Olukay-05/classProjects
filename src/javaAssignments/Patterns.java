package javaAssignments;

import java.sql.SQLOutput;

public class Patterns {
    public static void main(String[] args) {

        trianglePattern1(5);
        trianglePattern2(5);
        trianglePattern3(5);
    }

    public static void trianglePattern1(int number){

        for(int column = 1; column <= number; column++) {

            for (int space = 0; space < number-column; space++) {
                System.out.print("  ");
            }
            for (int rows = column; rows >= 1; rows--){
                System.out.print(rows + " ");
            }

            for (int rows = 2; rows <= column; rows++){
                System.out.print(rows + " ");
            }

            System.out.println();
        }

    }

    public static void trianglePattern2(int number) {


        for(int column = 1; column <= number; column++) {

            for (int space = 0; space < number-column; space++) {
                System.out.print("  ");
            }
            for (int rows = column; rows >= 1; rows--){
                System.out.print(rows + " ");
            }

            System.out.println();
        }

    }


    public static void trianglePattern3(int number){

        for(int column = 1; column <= number; column++) {

            for (int space = 0; space < number-column; space++) {
                System.out.print("  ");
            }
            for (int rows = column; rows >= 1; rows--){
                System.out.print("* ");
            }

            System.out.println();
        }

    }

}
