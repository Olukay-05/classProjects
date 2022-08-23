package com.animals;

public class Bird extends Animals{

    private int wings;
    private String feathers;
    private int eyes;


    public Bird(String name, int brain, int body, int size, int weight, int wings, String feathers, int eyes) {
        super(name, brain, body, size, weight);

        this.wings = wings;
        this.feathers = feathers;
        this.eyes = eyes;

    }

    public void toFly(){

    }

    public void layEggs(){

    }

    public int getWings() {
        return wings;
    }

    public void setWings(int wings) {
        this.wings = wings;
    }

    public String getFeathers() {
        return feathers;
    }

    public void setFeathers(String feathers) {
        this.feathers = feathers;
    }

    public int getEyes() {
        return eyes;
    }

    public void setEyes(int eyes) {
        this.eyes = eyes;
    }

    @Override
    public String toString() {
        return "Bird{" +
                "wings=" + wings +
                ", feathers='" + feathers + '\'' +
                ", eyes=" + eyes +
                '}';
    }
}
