package day40_FinalKeyword;

public class Zoo {

    public static void main(String[] args) {


        Dog dog = new Dog("Max", "Husky", 'M',"White", "Large", 4);

        dog.bark();

        System.out.println(dog.getBread());

        System.out.println(dog.getGender());

        dog.drink();

        dog.eat();

        System.out.println(dog);


    }
}
