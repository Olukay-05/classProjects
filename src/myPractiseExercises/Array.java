package myPractiseExercises;

public class Array {

    public static void main(String[] args) {
        int[] myArray = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
          Array values = new Array ();
        System.out.println("Maximum value in the array is::"+ values.max(myArray));
        System.out.println("Minimum value in the array is::"+ values.min(myArray));
    }


    public int max(int [] array) {
        int max = 0;

        for(int i=0; i<array.length; i++ ) {
            if(array[i]>max) {
                max = array[i];
            }
        }
        return max;

    }
    public int min(int [] array) {
        int min = array[0];

        for(int i=0; i<array.length; i++ ) {
            if(array[i]<min) {
                min = array[i];
            }
        }
        return min;
    }
}
