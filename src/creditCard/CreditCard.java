package creditCard;

public class CreditCard {
    private long number;
    private static int sum;

    public static boolean isValid(long number) {

        int sum = sumOfDoubleEvenPlace(number) + sumOfOddPlace(number);

        return sum % 10 == 0;
    }

    private static int sumOfOddPlace(long number) {

        number /= 10;

        int sum = 0;
        while (number > 0) {

            sum += getDigit((int) (number % 10) * 2);
            number /= 100;
        }
        return sum;
    }

    public static int sumOfDoubleEvenPlace(long number) {

        number /= 10;

        int sum = 0;
        while(number > 0){

            sum += getDigit((int)(number % 10) * 2);

            number /= 100;
        }

        return sum;
    }

    private static int getDigit(int number) {

        if(number < 10)
            return number;

        return number % 10 + number / 10;

    }

    public static boolean prefixMatched(long number, int d){

        long prefix = getPrefix(number, 1);

        long digit = getPrefix(number, d) % 10;

        return prefix == digit;
    }


    public static int getSize(long d){

        int size = 0;

        while(d > 0){

            size++;

            d /= 10;
        }
        return size;
    }


    public static long getPrefix(long number, int k){

        int size = getSize(number);

        while(size > k){

            size--;

            number /= 10;
        }

        return number;
    }

}