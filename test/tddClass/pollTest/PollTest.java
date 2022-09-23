package tddClass.pollTest;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import poll.Poll;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PollTest {


    private Poll poll;

    @BeforeEach
    void setUp(){
        poll = new Poll();

    }

    @Test
    void testCalculateAverage(){
        //given
        double[] pollNumbers = {10,20,30,40,50};
        //when
        double average = poll.calculateAverage(pollNumbers);
        //check
        assertEquals(30,average);

    }

    @Test
    void testCalculateHighestPoints(){
        //given
        int[] pollNumbers = {10,20,30,40,50};
        //when
        int highestPoint= poll.getHighestPoint(pollNumbers);
        assertEquals(50,highestPoint);
    }

    @Test
    void testCalculateLowestPoints(){
        //given
        int[] pollNumbers = {10,20,30,40,50};
        //when
        int lowestPoint = poll.getLowestPoint(pollNumbers);
        //assert
        assertEquals(10,lowestPoint);

    }
}
