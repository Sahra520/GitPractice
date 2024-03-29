package day44_OOPAbstractionContinue_Interface.animalTask;

public final class Parrot extends Animal implements Playable,Flyable{


    public Parrot(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " eats chocolate");
    }

    @Override
    public void play() {
        System.out.println(getName() + " is playing with bird toys");
    }

    @Override
    public void fly() {
        System.out.println(getName() + " can fly 20km/h");
    }
}
