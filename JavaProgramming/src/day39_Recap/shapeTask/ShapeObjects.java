package day39_Recap.shapeTask;

import java.util.concurrent.Callable;

public class ShapeObjects {

    public static void main(String[] args) {

        Circle circle = new Circle(10);
        System.out.println(circle);

        Circle circle1 = new Circle(12);
        circle1.getName();
        circle1.setRadius(16);
        System.out.println("");
        System.out.println(circle1.getRadius());
        System.out.println("");
        System.out.println(circle1);

        System.out.println("");

        Rectangle rectangle = new Rectangle(23.5, 34.6);
        System.out.println(rectangle);

        System.out.println("");

        Square square = new Square(4.8);
        System.out.println(square);

    }
}
