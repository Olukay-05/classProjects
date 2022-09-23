package poll;

import java.util.Scanner;

public class Main {

    private static Poll poll = new Poll();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        poll.displayTabularReport();


        String[] topics = poll.getTopics();
        int numberOfTopics = topics.length;
        System.out.println("Welcome to unicorns poll");

        var response = "";
        while (!response.equals("no")){

            for(int index = 0; index < numberOfTopics; index++) {
                System.out.println("rate " + topics[index]);
                int userRating = scanner.nextInt();

                if(userRating < 1 || userRating > 10) throw new UserFitNoGetSenseException("abeg try dey get sense");
            }

        }
        System.out.println();
    }

    private static void saveRating(int issueNumber, int userRating){
        int[][] responseDb = poll.getResponses();
        for (int index = 0; index < poll.getResponses().length; index++) {

            responseDb[issueNumber][userRating - 1] = responseDb[issueNumber][userRating] +1;
        }
    }
}
