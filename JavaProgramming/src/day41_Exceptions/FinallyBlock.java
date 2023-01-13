package day41_Exceptions;

public class FinallyBlock {

    public static void main(String[] args) {

        int[] arr = {1,2,3};

        try {
            System.out.println(arr[10]);
            System.out.println("Try Block");
        }catch (ArithmeticException e) {//exception can not handle this block
            System.out.println("Catch Block");
            e.printStackTrace();
            //  System.exit(0);//to terminate finally block
        }catch (RuntimeException e){
            e.printStackTrace();
            System.out.println("Catch Block 2");
        }finally {
            System.out.println("Finally Block");
        }
    }
}
