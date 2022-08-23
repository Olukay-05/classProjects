package tddClass;

import myPractiseExercises.Factorial;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FactorialTest {

    Factorial factors = new Factorial();

    @Test

    public void testForFactorials(){

        Factorial factors = new Factorial();
        int number = factors.factors(6);

        assertEquals (4, factors.factors(6));

    }
}
