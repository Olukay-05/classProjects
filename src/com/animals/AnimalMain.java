package com.animals;

public class AnimalMain {

    public static void main(String[] args) {


        Animals animal = new Animals("Animals", 1, 1,500, 10);
        Camel camel = new Camel("King",1, 1, 700, 1000, 2,2,1);

        camel.eat();


        Bird bird = new Bird("Eagle",1,1,50,150,2,"Black",2);

        System.out.println(bird);
        //System.out.println("My bird can", bird.toFly());

    }
}
