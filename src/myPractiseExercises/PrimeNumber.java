package myPractiseExercises;

public class PrimeNumber {





    public boolean isPrime(int number){

        int count = 0;

        for (int i = 1; i <= number; i++) {
            if (number % i  == 0){
                count ++;
            }
            if (count == 2){
                return true;
            }
            else return false;
        }

        return false;
    }
}
