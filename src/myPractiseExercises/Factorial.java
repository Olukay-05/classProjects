package myPractiseExercises;

public class Factorial {
//
//    public static void main(String[] args) {
//        Factorial factors = new Factorial();
//
//        int number = factors.factors(8);
//
//        System.out.println("Factor is: "+ number);
//    }


    public int factors(int number) {

        int count = 0;

        for (int i = 1; i <= number; i++) {

            if (number % i == 0) {
                count++;
            }
        }
        return count++;
    }
}
