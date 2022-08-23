package com.shapes;

public class CircleFromSimpleShapesObject
            extends SimpleShapesObject{
    private double radius;

    public CircleFromSimpleShapesObject() {
    }

    public CircleFromSimpleShapesObject(double radius) {
        this.radius = radius;
    }

    public CircleFromSimpleShapesObject(double radius, String color, boolean filled) {

        super(color, filled);
        this.radius = radius;
//        setColor(color);
//        setFilled(filled);

//        this.color = color; // Illegal because color has private access modifier in SimpleShapesObject
//        this.filled = filled; // Illegal because filled has private access modifier in SimpleShapesObject
    }


    /** Return radius */
    public double getRadius() {
        return radius;
    }

    /** Set a new radius */
    public void setRadius(double radius) {
        this.radius = radius;
    }

    /** Return area */
    public double getArea() {
        return radius * radius * Math.PI;
    }

    /** Return diameter */
    public double getDiameter() {
        return 2 * radius;
    }

    /** Return perimeter */
    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    /** Print the circle info */
    public void printCircle() {
        System.out.println("The circle is created " + getDateCreated() +
                " and the radius is " + radius);
    }




}
