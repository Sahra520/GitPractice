package day41_Exceptions;

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

            System.out.println("Catch block");

            System.out.println("Runtime Exception was occurred");
        }

        System.out.println("Test2 completed");

        System.out.println("------------------------------------------------------");



    }
}
