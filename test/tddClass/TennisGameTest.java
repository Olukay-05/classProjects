package tddClass;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TennisGameTest {

    private final TennisGame underTest = new TennisGame("Bob", "Rob");

    @Test
    public void testLoveAll(){

        Assertions.assertEquals("Love all", underTest.getScore());
    }

    @Test
    public void testFifteenAll(){
        underTest.playerOneScores();
        underTest.playerTwoScores();
        Assertions.assertEquals("Fifteen all", underTest.getScore());
    }

    @Test
    public void testThirtyAll(){
        underTest.playerOneScores();
        underTest.playerOneScores();
        underTest.playerTwoScores();
        underTest.playerTwoScores();
        Assertions.assertEquals("Thirty all", underTest.getScore());
    }
}
