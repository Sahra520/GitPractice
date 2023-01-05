package day40_FinalKeyboard;

public final class Cat extends Animal {

    public Cat(String name, String bread, char gender, String color, String size, int age) {
        super(name, bread, gender, color, size, age);
    }

    public final void scratch(){
        System.out.println(getName() + " is scratching.");
    }



}
