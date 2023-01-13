package day41_Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class TryCatchBlocks {

    public static void main(String[] args) {

        //Exception means, something went wrong

        System.out.println("Test1 started");
        try {

            System.out.println(9/0);

            System.out.println("Try block");

        }catch (ArithmeticException e){//e means variable

            System.out.println("Catch block");

            System.out.println("Arithmetic exception was occurred");
        }

        System.out.println("Test1 completed");

        System.out.println("---------------------------------------------------------------------------");

        System.out.println("Test started");

        try {
            int[] numbers = {1, 2, 3, 4, 5};

            System.out.println(numbers[200]);

            System.out.println("Try block");

        }catch (RuntimeException e){

            e.printStackTrace();
            //java.lang.ArrayIndexOutOfBoundsException: Index 200 out of bounds for length 5

          //System.out.println(e.getMessage());//Index 200 out of bounds for length 5

        }

        System.out.println("Test2 completed");

        System.out.println("------------------------------------------------------");


        System.out.println("Test3 started");

        try {
            System.out.println("Cydeo".substring(2, 0));

        } catch (RuntimeException e){

            e.printStackTrace();/*java.lang.StringIndexOutOfBoundsException: begin 2, end 0, length 5
	at java.base/java.lang.String.checkBoundsBeginEnd(String.java:3319)
	at java.base/java.lang.String.substring(String.java:1874)
	at day41_Exceptions.TryCatchBlocks.main(TryCatchBlocks.java:53)
	*/
        }

        System.out.println("Test3 completed");

        System.out.println("-----------------------------------------------");

        System.out.println("Hello");

        try{
            Thread.sleep(3000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("Cydeo");

        System.out.println("---------------------------------");
/*

        try {
            FileInputStream file = new FileInputStream("File path");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

*/
        System.out.println("World");
    }
}
