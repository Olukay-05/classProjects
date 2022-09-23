package chapter6;

public class ParkingChargesApp {

        private String name;
        private double duration;
        private double charges;




    public ParkingChargesApp(double duration){

        this.duration = duration;
    }
    public ParkingChargesApp(String name, double duration, double charges) {
        this.name = name;
        this.duration = duration;
        this.charges = charges;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    public double getCharges() {
        return calculateCharges();
    }

    public void setCharges(double charges) {
        this.charges = charges;
    }

    public double calculateCharges(){

        if(duration > 3){

            duration = 10;

           // charges = 2.0 * (charges) + (10 - 3) * 0.5;

            charges = charges + Math.ceil(duration - 3) * 0.5;

        }

        if (charges > 10.0) {

            charges = 10.0;
        }
            return charges;
    }

//    public double totalCharges(){
//
//        return charges * total;
//    }
}
