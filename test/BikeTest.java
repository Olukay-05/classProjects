import javaAssignments.AirCondition;
import org.junit.jupiter.api.Test;
import tddClass.Bike;

import static org.junit.jupiter.api.Assertions.*;

public class BikeTest {

    @Test
    void turnOn() {
        //Given that
        Bike ducati = new Bike();
        //when
        boolean isOn = ducati.turnOn();
        //check that
        assertTrue(isOn);

    }

    @Test
    void turnOff() {
        //Given that
        Bike ducati = new Bike();
        //when
        boolean isOff = ducati.turnOff();
        //check that
        assertFalse(isOff);

    }

    @Test
    void DucatiAccelerate(){
        //Given that
        Bike ducati = new Bike();
        //when
        ducati.setSpeed(10);
        ducati.setGear(2);
        //check that
        assertEquals(12, ducati.ducatiAccelerate());
    }

    @Test
    void DucatiDeccelerate(){
        //Given that
        Bike ducati = new Bike();
        //when
        ducati.setSpeed(15);
        ducati.setGear(2);
        //check that
        assertEquals(13, ducati.ducatiDeccelerate());
    }

    @Test
    void GearChange(){
        //given that
        Bike ducati = new Bike();
        //when
        ducati.gearChange(32);
        assertEquals(3, ducati.getGear());

    }



}

