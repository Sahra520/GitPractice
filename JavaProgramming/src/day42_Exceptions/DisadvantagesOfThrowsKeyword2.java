package day42_Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class DisadvantagesOfThrowsKeyword2 {

    public static void main(String[] args) throws InterruptedException, NullPointerException {

        method1();
        method2();
        method3();
        method4();
        method5();

        String str = null;
        try {
            System.out.println(str.charAt(0));
        }catch (RuntimeException e){
            e.printStackTrace();
        }


    }
    public static void method1() throws InterruptedException {
       // new FileInputStream("");
        Thread.sleep(3000);
    }

    public static void method2() throws InterruptedException {

        method1();
    }

    public static void method3() throws InterruptedException {
       method2();
       Thread.sleep(3000);
    }

    public static void method4() throws InterruptedException {
        method3();//not recommended or solve with try & catch
    }


public static void method5(){
    try {
        method4();
    } catch (InterruptedException e) {
        throw new RuntimeException(e);//best solution
    }
}





}
