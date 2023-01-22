package day43_OOPAbstractionIntro_abstractClass_abstractMethod.Employee;

public final class Tester extends Employee{

    public Tester(String name, int age, char gender, int id, String jobTitle, double salary) {
        super(name, age, gender, id, jobTitle, salary);
    }

    @Override
    public void work() {
        System.out.println(getName() + " " + getJobTitle() + " is testing the application");
    }

    @Override
    public void sleep() {
        System.out.println(getName() + " sleeps 8 hours");
    }
    public void bugReport(){
        System.out.println(getName() + " is creating bug reports");
    }

}
/*
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
 */