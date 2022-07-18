package tddClass;

public class Bike {

    private boolean bikeIsOn;
    private boolean bikeIsOff;
    private int speed;
    private int gear;

    public Bike(boolean bikeIsOn, boolean bikeIsOff, int speed, int gear) {
        this.bikeIsOn = bikeIsOn;
        this.bikeIsOff = bikeIsOff;
    }

    public Bike() {

    }

    public boolean turnOn() {
        return true;
    }


    public boolean turnOff() {
        return false;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setGear(int gear) {
        this.gear = gear;
    }

    public int getGear(){
        return gear;
    }


    public int ducatiAccelerate() {
        if (gear == 1)
            speed = speed + 1;
        if (gear == 2)
            speed = speed + 2;
        if (gear == 3)
            speed = speed + 3;
        if (gear == 4)
            speed = speed + 4;

        return speed;
    }


    public int ducatiDeccelerate() {
        if (gear == 1)
            speed = speed - 1;
        if (gear == 2)
            speed = speed - 2;
        if (gear == 3)
            speed = speed - 3;
        if (gear == 4)
            speed = speed - 4;

        return speed;
    }


    public int gearChange(int gearrange) {
        if (gearrange >= 0 & gearrange <= 20)
            gear = 1;

        if (gearrange >= 21 & gearrange <= 30)
            gear = 2;

        if (gearrange >= 31 & gearrange <= 40)
            gear =  3;

        if (gearrange >= 41)
            gear = 4;

        return gearrange;

    }
}
