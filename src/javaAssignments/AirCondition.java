package javaAssignments;

public class AirCondition {


    private boolean isOn;
    private String productName;
    private int temperature = 16;


    public AirCondition (boolean isOn, String productName, int temperature){

        this.isOn = isOn;
        this.productName = productName;
        this.temperature = temperature;
    }

    public AirCondition() {

    }


    public void setOn(boolean isOn){
        this.isOn = isOn;
    }
    public boolean isOn(){
        return isOn;
    }

    public void setProductName(String productName){
        this.productName = productName;
    }
    public String getProductName(){
        return productName;
    }

    public void setTemperature(int temperature){
        this.temperature = temperature;
    }
    public int getTemperature() {
        return temperature;
    }

    public int increaseTemperature(int amount) {
        if (temperature <= 16) {
            temperature = 16;
            return temperature;
        }


        return temperature - amount;
    }

    public int decreaseTemperature(int amount){
       if (temperature >= 30){
           temperature = 30;
           return temperature;
       }

        return temperature + amount;
    }

    public boolean turnOn() {
        return true;
    }

    public boolean turnOff() {
        return false;
    }

}




