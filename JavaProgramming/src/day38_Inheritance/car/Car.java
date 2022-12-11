package day38_Inheritance.car;

public class Car {

    public String brand;
    public String model;
    public String year;
    public double price;
    public String color;
    public double miles;

    public Car(String brand, String model, String year, double price, String color, double miles) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.price = price;
        this.color = color;
        this.miles = miles;
    }


    public void start(){
        System.out.println(brand + " " + model + " is starting");
    }

    public void drive(){
        System.out.println(brand + " " + model + " is driving");
    }

    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year='" + year + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                ", miles=" + miles +
                '}';
    }

    /*
    CarTask:
create a class called Car
   instance variables:
      brand, model, year, price, color, miles
  add a constructor to set all the fields
     instance methods:
  start(), drive(), toString()

  create the following subclasses of Car:
  1. Toyota:
       extra methods:
             reliable()

  2. BMW:
       extra methods:
             breaksDown()
             racing()

  3. Tesla:
       extra methods:
             autoPilot()


     */
}
