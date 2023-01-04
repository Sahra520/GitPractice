package day39_Recap.cydeoTask;

public class Cydeo {

    public static void main(String[] args) {

        Tester tester = new Tester("Sahra", 38, 'F',1224,"Fullstack SDET",135000);
        System.out.println(tester);

        System.out.println(" ");

        Developer developer = new Developer("Szahra",40,'F',7046,"Java Developer",180000);
        System.out.println(developer);

        System.out.println(" ");

        Teacher teacher = new Teacher("Daniel", 32, 'M', 3, "Math Teacher", 100000);
        System.out.println(teacher);

        System.out.println(" ");

        Student student = new Student("Sahragul", 37,'F', 5,"SDET");
        System.out.println(student);

        System.out.println(" ");


        teacher.setAge(39);
        System.out.println("Teacher age: " + teacher.getAge());
        System.out.println(teacher);

    }

}
 /*
 7. Create a class named Cydeo:

    create objects of Tester, Developer,Teacher, Student

        test all the functions of each objects

        Analyze the relationships between the classes
  */

