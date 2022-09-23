package poll;

import java.util.Arrays;

public class Poll {

    private String[] topics = {"Financial issues","Psycho issue","Gender Inequality","Hunger","Breakfast"};

    private  int[][] responses = new int[5][10];


    public double calculateAverage(double[] pollNumbers) {
        int totalOfRating=0;
        for(double pollNumber:pollNumbers){
            totalOfRating+=pollNumber;
        }
        return totalOfRating/pollNumbers.length;
    }

    public int getHighestPoint(int[] pollNumbers) {
        int highestNumber = pollNumbers[0];

        for (int i = 0; i < pollNumbers.length; i++) {
            if(pollNumbers[i] > highestNumber){
                highestNumber = pollNumbers [i];
            }
        }
        return highestNumber;
    }

    public int getLowestPoint(int[] pollNumbers) {
        int lowestNumber = pollNumbers[0];

        for (int i = 0; i < pollNumbers.length; i++) {
            if(pollNumbers[i] < lowestNumber){
                lowestNumber = pollNumbers [i];
            }
        }
        return lowestNumber;
    }

    public String[] getTopics() {

        return topics;
    }

    public void displayTabularReport(){

        String header = String.

                format("\t\t\t\t\t\t\t%d\t%d\t%d\t%d\t%d\t%d\t%d\t%d\t%d\t%d\n",
                        1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        System.out.println(header);
//        for(String topic:getTopics()){
//            System.out.println(topic);
//            System.out.println();
//        }

        for(int index = 0; index < getResponses().length; index++){

//            for (int secondIndex = 0; secondIndex < getResponses()[index].length; secondIndex)
            System.out.printf("%s\t", getTopics()[index]);
            System.out.println(Arrays.toString(getResponses()[index]));
            System.out.println();
        }

    }

    int[][] getResponses() {

        return responses;
    }
}
