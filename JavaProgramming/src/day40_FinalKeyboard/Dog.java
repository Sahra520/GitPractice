package day40_FinalKeyboard;

public final class Dog extends Animal{

    public Dog(String name, String bread, char gender, String color, String size, int age) {
        super(name, bread, gender, color, size, age);
    }

    public void eat(){
        System.out.println(getName() + " is eating dog food");
    }

    /*  public final void drink(){
        System.out.println(getName() + "is drinking water");//final method can not be overridden
    } */

    public void bark(){
        System.out.println(getName() + " is barking");
    }
}
