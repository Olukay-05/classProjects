package com.shapes;

public class TestShapes {

        public static void main(String[] args) {
            CircleFromSimpleShapesObject circle =
                    new CircleFromSimpleShapesObject(1);
            System.out.println("A circle " + circle.toString());
            System.out.println("The color is " + circle.getColor());
            System.out.println("The radius is " + circle.getRadius());
            System.out.println("The area is " + circle.getArea());
            System.out.println("The diameter is " + circle.getDiameter());

            RectangleFromSimpleShapesObject rectangle =
                    new RectangleFromSimpleShapesObject(2, 4);
            System.out.println("\nA rectangle " + rectangle.toString());
            System.out.println("The area is " + rectangle.getArea());
            System.out.println("The perimeter is " +
                    rectangle.getPerimeter());
        }
}
