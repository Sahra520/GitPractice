package day44_OOPAbstractionContinue_Interface.animalTask;

public final class Eagle extends Animal implements WildAnimal,Flyable{

    public Eagle(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " eats snake");
    }


    @Override
    public void hunt() {
        System.out.println(getName() + " is hunting snake");
    }

    @Override
    public void fly() {
        System.out.println(getName() + " can fly 50km/h");
    }
}
