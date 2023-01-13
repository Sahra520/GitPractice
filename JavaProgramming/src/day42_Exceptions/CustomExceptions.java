package day42_Exceptions;



    class NoBreakException extends Exception{
    }


public class CustomExceptions {

    public static void main(String[] args) {


            try {
                throw new NoBreakException();
            } catch (NoBreakException e) {
                e.printStackTrace();
            }

       // throw new FadyException();
       // throw new FadyException("It's time for short break");

    }
}
