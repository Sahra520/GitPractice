package day43_OOPAbstractionIntro_abstractClass_abstractMethod;

public class day43_classNote {

    /*
Page
1
of 4
Java Day43
Topic: Abstraction Intro
Abstract Method
Abstract class
package name: day43_Abstraction
Exception:
checked & unchecked
try & catch
throws;
throw;
throw new RuntimeException("Exception Message");
Exceptions Short quiz due by 11:40 am
OOP Encapsulation: hiding the data
OOP Inheritance: creating IS A relation between classes (parent/child  or
super/sub)
method overriding: giving different implementation to
the method
Abstraction Topics:
Abstract Method
Abstract Class
Interface
abstract class vs class
abstract class vs interface
Abstraction: focusing on the essentials without worrying about the small
details(implementations) of the method
abstract class Device{
turnOff();
}
abstract class Phone extends Device{
call();
}
class Iphone extends Phone{
}
class Samsung extends Phone{
}

Car Task:
abstract Car:
make, model, color, year, price....
start();
stop()
Honda extends Car:
start(): twist the key to ignition
Audi extends Car:
start(): push the start button
Tesla extends Car:
start(): Say "Start"

Employee task:
abstract Person:
name, age, gender(final)
eat();
sleep();
abstract Employee extends Person:
 id(final), jobTitle, salary...
work();
Tester
work(): testing
Developer
work(): developing
Teacher
work(): teaching
Driver
work(): driving
...

Shape task:
Shape:
name
Encapsulate the fields
Add constructor to set the fields
area()
perimeter()
toString(): name, area, perimeter
Create the following subclasses of Shape and add the additional
features that are needed:
Rectangle:
area(): w * l
perimeter(): 2 * (w+l)
Square:
area(): s * s
perimeter: 4 * s
Circle:
area(): r * r * pi
perimeter(): 2 * r * pi

Animal task:
abstract Animal
eat();
Dog
Cat
Tiger
Eagle
     */
}
