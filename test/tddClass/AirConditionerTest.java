package tddClass;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AirConditionerTest {

    AirConditioner ac;

    @BeforeEach
    void setUp() {
        ac = new AirConditioner();
    }

    @Test
    void acCanBeTurnedOn() {
        assertFalse(ac.isOn());

        ac.turnOn();
        assertTrue(ac.isOn());
    }

    @Test
    void acCanBeTurnedOff() {
        ac.turnOn();
        assertTrue(ac.isOn());

        ac.turnOff();
        assertFalse(ac.isOn());
    }

    @Test
    void acCanIncreaseTemperature() {
        ac.turnOn();
        assertEquals(16, ac.getTemperature());

        ac.increaseTemperature();
        ac.increaseTemperature();
        assertEquals(18, ac.getTemperature());
    }


    @Test
    void acCanDecreaseTemperature() {
        ac.turnOn();
        assertEquals(16, ac.getTemperature());


        ac.increaseTemperature();
        ac.increaseTemperature();
        ac.increaseTemperature();
        ac.increaseTemperature();
        assertEquals(20, ac.getTemperature());


        ac.decreaseTemperature();
        assertEquals(19, ac.getTemperature());
    }

    @Test
    void acCannotIncreaseMoreThanLimit30(){
        ac.turnOn();
        assertEquals(16, ac.getTemperature());


        ac.increaseTemperature();
        ac.increaseTemperature();
        ac.increaseTemperature();
        ac.increaseTemperature();
        ac.increaseTemperature();
        ac.increaseTemperature();
        ac.increaseTemperature();
        ac.increaseTemperature();
        ac.increaseTemperature();
        ac.increaseTemperature();
        ac.increaseTemperature();
        ac.increaseTemperature();
        ac.increaseTemperature();
        ac.increaseTemperature();
        ac.increaseTemperature();
        ac.increaseTemperature();
        ac.increaseTemperature();
        assertEquals(30, ac.getTemperature());

    }

    @Test
    void acCannotDecreaseMoreThanLimit16() {
        ac.turnOn();
        assertEquals(16, ac.getTemperature());

        ac.decreaseTemperature();
        assertEquals(16, ac.getTemperature());
    }

    @Test
    void acWillRemainSameWhenTurnoffAndTurnOn(){
        ac.turnOn();
        assertEquals(16, ac.getTemperature());

        for (int i = 0; i < 5 ; i++) {
            ac.increaseTemperature();
        }

        assertEquals(21,ac.getTemperature());

        ac.turnOff();
        ac.increaseTemperature();
        assertNotEquals(22, ac.getTemperature());

        ac.turnOn();
        assertEquals(21,ac.getTemperature());
    }
}