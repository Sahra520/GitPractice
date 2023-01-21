package day43_OOPAbstractionIntro_abstractClass_abstractMethod.Employee;

public abstract class Person {

    private String name;
    private int age;
    private char gender;

    public Person(String name, int age, char gender) {
        setName(name);
        setAge(age);
        setGender(gender);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public char getGender() {
        return gender;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if (age <= 0){
            throw new RuntimeException("Invalid age: " + age);
        }
        this.age = age;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public void eat(){
        System.out.println(name + " is eating baklava");
    }

    public abstract void sleep();


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
/*
Employee task:
abstract Person:
name, age, gender
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
 */