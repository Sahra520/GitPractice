package day42_Exceptions;

import day04_Variables.Rectangle;

import java.util.NoSuchElementException;

public class ThrowKeyword2 {

    public static void main(String[] args) {

       throw new NoSuchElementException("There is no such element as break");
       // throw new InterruptedException();//gives error because its unhandled exception/checked exception
       // System.out.println("Hello World");//after the throw keyword any code fragment is unreachable

        // throw  new Rectangle(5,7);





    }
}
