package day46_Polymorphism;

import day43_OOPAbstractionIntro_abstractClass_abstractMethod.Employee.*;
import day44_OOPAbstractionContinue_Interface.animalTask.Animal;
import day44_OOPAbstractionContinue_Interface.animalTask.Dog;
import day44_OOPAbstractionContinue_Interface.animalTask.Playable;
import day45_OOP_AbstractionContinue_Interface.shapeTask.*;

import java.util.ArrayList;

public class PolymorphismIntro {

    public static void main(String[] args) {

        String str = "Wooden Spoon";

        Integer n1 = 2;

        Double b2 = 5.5;

        Boolean r1 = true;

        Object[] array = {str, n1, b2, r1, new Circle(4), new Square(7)};



        Employee tester = new Tester("Ali", 30, 'M', 42, "SDET", 145000);
        Employee developer = new Developer("Alex", 28, 'M', 32, "Web Developer", 155000);
        Employee teacher = new Teacher("Angel", 28,'F',22,"English Teacher", 85000);
        Employee driver = new Driver("John", 34,'M',42,"Lyft Driver", 75000);


        ArrayList<Employee>cydeoEmployees = new ArrayList();

        cydeoEmployees.add(tester);
        cydeoEmployees.add(developer);
        cydeoEmployees.add(teacher);
        cydeoEmployees.add(driver);


        System.out.println("---------------------------------------------");

        Employee employee = new Tester("Ali", 30, 'M', 42, "SDET", 145000);
        employee.work();

        /*
        WebDriver driver1 = new ChromeDriver();
        Webdriver driver2 = new FireFoxDriver();

        driver1.get(amazon);
        driver2.get(google);

        Animal animal = new Dog(); //drinks water
        animal.drink();

        Animal animal = new Cat(); //drinks milk
        animal.drink();

        Animal animal = new Tiger(); // drinks water
        animal.drink();
         */

        Animal animal = new Dog("Garaja","Alabay",'M',4,"Big","White");
        animal.drink();
        animal.eat();
        //animal.play(); compile error
        //animal.bark(); compile error
        Dog animal1 = new Dog("Garaja","Alabay",'M',4,"Big","White");
        animal1.play();
        animal1.bark();
        animal1.eat();
        animal1.drink();

        Playable animal2 = new Dog("Garaja","Alabay",'M',4,"Big","White");
        animal2.play();
        //animal2.eat(); error
        //animal2.drink(); error


        Shape shape = new Circle(5);
        shape.area();

        boolean isSquare = shape instanceof Square;
        boolean isRectangle = shape instanceof Rectangle;
        boolean isTriangle = shape instanceof Triangle;
        boolean isCircle = shape instanceof Circle;

        System.out.println("isSquare = " + isSquare);
        System.out.println("isRectangle = " + isRectangle);
        System.out.println("isTriangle = " + isTriangle);
        System.out.println("isCircle = " + isCircle);



        /*
        WebDriver driver:

        if(driver instanceof Chrome) {
           Chrome browser will open
       }else if(driver instanceof firefox) {
           Firefox browser will open
       }
         */

    }

    public static class day47_PolymorphismContinue {
    }
}
