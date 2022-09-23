package tddClass;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BikeTest {
    private Bike bike;
    @BeforeEach
    public void setUp() {
        bike = new Bike();
    }

    @Test
    public void bikeCanBeTurnedOnTest() {
        Bike bike = new Bike();
        assertFalse(bike.isOn());

        bike.turnOn();
        assertTrue(bike.isOn());
    }

    @Test
    public void bikeCanBeTurnedOffTest() {
        Bike bike = new Bike();
        assertFalse(bike.isOff());
        bike.turnOn();
        assertTrue(bike.isOn());

        bike.turnOff();
        assertFalse(bike.isOn());
    }


    @Test
    public void bikeCanBeAccelerateOnGearOneTest() {
        bike.turnOn();
        assertEquals(0, bike.getSpeed());
        assertEquals(1, bike.getGear());
        bike.increaseSpeed();
        assertEquals(1, bike.getSpeed());
    }

    @Test
    public void bikeWilNotAccelerateWhenOffTest() {
        assertFalse(bike.isOn());
        assertEquals(0, bike.getSpeed());

        bike.increaseSpeed();
        assertEquals(0, bike.getSpeed());
    }

    @Test
    public void bikeCanChangeFromGearOneToGearTwoAutomatically(){
        bike.turnOn();
        for(int i = 0; i < 21; i++){
            bike.increaseSpeed();
        }
        assertEquals(21, bike.getSpeed());
        assertEquals(2, bike.getGear());
        bike.increaseSpeed();
        assertEquals(2,bike.getGear());
        assertEquals(23, bike.getSpeed());
    }

    @Test
    public void bikeCanAccelerateOnGearTwoTest(){
        bike.turnOn();
        for(int i=0; i < 21; i++){
            bike.increaseSpeed();
        }
        assertEquals(21, bike.getSpeed());
        assertEquals(2,bike.getGear());

        bike.increaseSpeed();
        bike.increaseSpeed();
        assertEquals(25,bike.getSpeed());
        assertEquals(2,bike.getGear());

    }

    @Test
    public void bikeCanChangeFromGearTwoToGearThree(){
        bike.turnOn();
        for(int i=0; i < 25; i++){
            bike.increaseSpeed();
        }
        assertEquals(29,bike.getSpeed());
        assertEquals(2, bike.getGear());

        bike.increaseSpeed();
        assertEquals(3,bike.getGear());
        assertEquals(31,bike.getSpeed());
    }

    @Test
    public void bikeCanDecelerateOnGearOneTest(){
        bike.turnOn();
        assertTrue(bike.isOn());

        assertEquals(0, bike.getSpeed());
        assertEquals(1, bike.getGear());
        for (int i = 0; i < 5; i++) {
            bike.increaseSpeed(); //Increase Speed By 5
        }
        assertEquals(5, bike.getSpeed());

        bike.decreaseSpeed(); //Check that Speed can decelerate by One
        assertEquals(4, bike.getSpeed());
        assertEquals(1, bike.getGear());
    }

    @Test
    public void bikeCanDecelerateByTwoInGearTwoAutomatically(){
        bike.turnOn();
        assertTrue(bike.isOn());

        for(int i = 0; i < 23; i++){
            bike.increaseSpeed(); //Increase Speed
        }
        assertEquals(25, bike.getSpeed());
        assertEquals(2,bike.getGear());

        bike.decreaseSpeed(); //Check that Speed can decelerate by Two
        bike.decreaseSpeed();
        assertEquals(21,bike.getSpeed());
        assertEquals(2,bike.getGear());
    }
}