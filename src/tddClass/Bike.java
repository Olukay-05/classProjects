package tddClass;

public class Bike {
    private boolean isOn;
    private int speed;
    private int gear;

    public boolean isOn(){
        return isOn;
    }

    public void turnOn(){
        isOn = true;
        gear = 1;
    }

    public boolean isOff() {
        gear = 0;
        speed = 0;
        return isOn = false;
    }

    public void turnOff() {
        isOn=false;
        gear = 0;
        speed = 0;
    }

    public int getSpeed(){
        return speed;
    }

    public int getGear(){
        return gear;
    }

    public void increaseSpeed() {
        if (isOn) accelerate();
    }
    private void accelerate(){
        if (gear == 3) {
            speed +=3;
        }
        if (gear == 2) {
            speed += 2;
            if (speed >= 31) gear++;
        }
        if(gear == 1) increaseSpeedOnGearOne();

    }

    private void increaseSpeedOnGearOne() {
        speed ++;
        if(speed > 20) gear ++;
    }

    public void decreaseSpeed() {
        if (isOn) decelerate();
    }
    private void decelerate(){
        if(gear == 2){
            speed = speed - 2;
        }
        if(gear == 1) decreaseSpeedOnGearOne();
    }

    private void decreaseSpeedOnGearOne(){
        speed--;
    }
}
