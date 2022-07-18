package tddClass;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;


public class TestDrillerTest {

    TestDrillerTest testDriller;

    @BeforeEach
    void setUp() {
        testDriller = new TestDrillerTest();
    }
    @Test
    void testDrillerExists(){
        assertNotNull(testDriller);
    }

 //   @Test
 //   void testUnitPrice(){
   //     testDriller.setCopiesPurchased(1);
     //   assertEquals(2000, testDriller.getUnitPrice());

    }




//}

