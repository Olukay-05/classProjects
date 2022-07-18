package javaAssignments;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AirConditionTest {

    @Test
    void turnOn() {
        //Given that
        AirCondition panasonic = new AirCondition();
        //when
        boolean isOn = panasonic.turnOn();
        //check that
        assertTrue(isOn);
    }

    @Test
    void turnOff(){
        //Given that
        AirCondition panasonic = new AirCondition();
        //when
        boolean isOff = panasonic.turnOff();
        //check that
        assertFalse(isOff);
    }

    @Test
    void increaseTemperature(){
        //Given that
        AirCondition panasonic = new AirCondition();
        panasonic.setTemperature(16);
        panasonic.increaseTemperature(1);

        //when
        int result = panasonic.getTemperature();
        //check that

        assertEquals(16, result);
    }

    @Test
    void decreaseTemperature(){
        //Given that
        AirCondition panasonic = new AirCondition();
        panasonic.setTemperature(21);
        //when
        int result = panasonic.decreaseTemperature(1);
        //check that
        assertEquals(22, result);
    }

    @Test
    void decreaseTemperatureCannotBeAbove30() {
        //given
        AirCondition panasonic = new AirCondition();
        panasonic.setTemperature(30);
        panasonic.decreaseTemperature(1);

        //when
        int result = panasonic.getTemperature();

        //check
        assertEquals(30, result);

    }

    @Test
    void increaseTemperatureCannotBeLow16(){
        //given
        AirCondition panasonic = new AirCondition();

        panasonic.setTemperature(16);
        panasonic.increaseTemperature(1);

        //when
        int result = panasonic.getTemperature();

        //check
        assertEquals(16, result);
    }




}

