package tddClass;

public class TennisGame {

    private int playerOneScore;
    private int playerTwoScore;

    public TennisGame(String player1Name, String player2Name) {
    }

    public String getScore() {
        if (playerOneScore == playerTwoScore){
            if (playerOneScore == 0){
                return "Love all";
            } else if (playerOneScore == 1) {
                return "Fifteen all";
            } else if (playerOneScore == 2) {
                return "Thirty all";
            }
        }
        return "Love all";
    }

    public void playerOneScores() {
        playerOneScore++;
    }

    public void playerTwoScores() {
        playerTwoScore++;
    }
}
