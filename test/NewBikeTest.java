import org.junit.jupiter.api.Test;
import tddClass.NewBike;

import static org.junit.jupiter.api.Assertions.*;

public class NewBikeTest {

    @Test
    void turnOn() {
        //Given that
        NewBike ducati = new NewBike();
        //when
        boolean isOn = ducati.turnOn();
        //check that
        assertTrue(isOn);

    }

    @Test
    void turnOff() {
        //Given that
        NewBike ducati = new NewBike();
        //when
        boolean isOff = ducati.turnOff();
        //check that
        assertFalse(isOff);

    }

    @Test
    void DucatiAccelerate(){
        //Given that
        NewBike ducati = new NewBike();
        //when
        ducati.setSpeed(10);
        ducati.setGear(2);
        //check that
        assertEquals(12, ducati.ducatiAccelerate());
    }

    @Test
    void DucatiDeccelerate(){
        //Given that
        NewBike ducati = new NewBike();
        //when
        ducati.setSpeed(15);
        ducati.setGear(2);
        //check that
        assertEquals(13, ducati.ducatiDeccelerate());
    }

    @Test
    void GearChange(){
        //given that
        NewBike ducati = new NewBike();
        //when
        ducati.gearChange(32);
        assertEquals(3, ducati.getGear());

    }



}

