package day41_Exceptions;

import day39_Recap.cydeoTask.Employee;

public class MultiCatchBlocks {

    public static void main(String[] args) {

        Employee employee = null;

        /*
        Exception in thread "main" java.lang.NullPointerException
	at day41_Exceptions.MultiCatchBlocks.main(MultiCatchBlocks.java:10)
         */

        try {
            System.out.println(employee.getSalary());

        }catch (IndexOutOfBoundsException e){
            System.out.println("First catch block");
            e.printStackTrace();

        }catch (ArithmeticException e){
            System.out.println("Second catch block");
            e.printStackTrace();

        }catch (NullPointerException e){
            System.out.println("Third catch block");
            e.printStackTrace();

        }catch (RuntimeException e){
            //parent exception type can not be placed before the child exception type
            e.printStackTrace();
        }finally {
            System.out.println("Tested");
        }
 /*       java.lang.NullPointerException
	at day41_Exceptions.MultiCatchBlocks.main(MultiCatchBlocks.java:17)      */

        System.out.println("Hello");

        System.out.println("-------------------------------------");


        try {
            System.out.println("Java".charAt(-1));
        }catch (RuntimeException e){
            e.printStackTrace();
        }
    }
}
