package day41_Exceptions;

import day39_Recap.cydeoTask.Student;

public class Checked_vs_Unchecked {

    public static void main(String[] args) throws InterruptedException {

        //unchecked exception:
        int a = 10;
        int b = 0;

     //   System.out.println(a/b);//Exception in thread "main" java.lang.ArithmeticException: / by zero
        //Process finished with exit code 1  //terminated program

       // System.out.println("Wooden Spoon");

        char[] characters = {'A','B','C'};
        //                     0,  1,  2
      //  System.out.println(characters[99]);
        //Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 99 out of bounds for length 3
        //Process finished with exit code 1

        Student student = null;
        //System.out.println(student.getName());//Process finished with exit code 1
        //student.study();//Process finished with exit code 1



        String str = "Wooden Spoon";
        //str = null; //Garbage Collection

        //System.out.println(str.toUpperCase());//Exception in thread "main" java.lang.NullPointerException
        //Process finished with exit code 1

        String str2 = "   ";
        System.out.println(str2.isEmpty());//false
        System.out.println(str2.isBlank());//true

        System.out.println("-------------------------------------");

        //checked Exception

        System.out.println("hello");

        Thread.sleep(3000);

        System.out.println("Cydeo");


    }
}
