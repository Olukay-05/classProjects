package tddClass;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class FuelDiscountTest {
    FuelDiscount fuelDiscount;
    @BeforeEach
    void setUp(){
        fuelDiscount = new FuelDiscount("322, Herbert Macauley");
    }
    @Test
    void fuelDiscountExists(){
        assertNotNull(fuelDiscount);
    }
    @Test
    void testDiscountInPrice(){
        fuelDiscount.setLitresPurchased(2);
        assertEquals(8, fuelDiscount.getDiscountInPrice());
    }
    @Test
    void testTotalPrice(){
        fuelDiscount.setLitresPurchased(2);
        assertEquals(392, fuelDiscount.getTotalPrice());
    }
}