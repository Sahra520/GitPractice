package day43_OOPAbstractionIntro_abstractClass_abstractMethod.Employee;

public class EmployeeObjects {

    public static void main(String[] args) {

        //Person person = new Person("Josh", 35, 'M');
        //Employee employee = new Employee("Ali",30,'M',42,"SDET",145000.00);

        Tester tester = new Tester("Ali", 30, 'M', 42, "SDET", 145000);
        Developer developer = new Developer("Alex", 28, 'M', 32, "Web Developer", 155000);
        Teacher teacher = new Teacher("Angel", 28,'F',22,"English Teacher", 85000);
        Driver driver = new Driver("John", 34,'M',42,"Lyft Driver", 75000);

        System.out.println(tester);
        System.out.println(developer);
        System.out.println(teacher);
        System.out.println(driver);

        tester.work();
        tester.sleep();
        tester.bugReport();
        tester.eat();

        System.out.println("---------------------------");

        developer.sleep();
        developer.work();
        developer.unitTest();
        developer.eat();

        System.out.println("------------------------------");

        teacher.sleep();
        teacher.work();
        teacher.eat();

        System.out.println("-------------------------------------");

        driver.sleep();
        driver.work();
        driver.eat();

    }
}
