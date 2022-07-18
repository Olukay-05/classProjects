package myPractiseExercises;

public class ArrayOfNumbers {

    public static void main(String[] args) {

        arrayOfNumbers();

    }

    public static void arrayOfNumbers() {

        int[] arrayOfNumbers = new int[10];

        int[] array = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};

        int total = 0;

        for (int counter = 0; counter < array.length; counter++) {

            total += array[counter];
        }
        System.out.printf("Total of array elements: %d%n", total);


    }

}