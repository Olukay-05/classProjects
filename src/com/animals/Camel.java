package com.animals;

public class Camel extends Animals {

        private int eyes;
        private int legs;
        private int mouth;


    public Camel(String name, int brain, int body, int size, int weight, int eyes, int legs, int mouth) {
        super(name, brain, body, size, weight);

        this.eyes = eyes;
        this.legs = legs;
        this.mouth = mouth;
    }

//    public void eat(){
//        System.out.println("Camels love to eat");
//    }

    public int getEyes() {
        return eyes;
    }

    public void setEyes(int eyes) {
        this.eyes = eyes;
    }

    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    public int getMouth() {
        return mouth;
    }

    @Override
    public void eat() {
        super.eat();

        System.out.println("Camels are terrestrials animals. My camel's name is: " + getName());
        System.out.println("King has" + " " + getBrain() + " " + "brain.");
        System.out.println("He also has " + getEyes() + " " + "eyes" + " and " + getLegs() + " legs");

//        System.out.println("Camels are terrestrials animals. My camel's name is: " + camel.getName());
//        System.out.println("King has" + " " + camel.getBrain() + " " + "brain.");
//        System.out.println("He also has " + camel.getEyes() + " " + "eyes" + " and " + camel.getLegs() + " legs");
    }

    public void setMouth(int mouth) {
        this.mouth = mouth;
    }

    private void chew(){

        System.out.println(" Camels chew slowly while eating");


    }



}
