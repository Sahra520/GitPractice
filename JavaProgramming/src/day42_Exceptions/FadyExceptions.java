package day42_Exceptions;

public class FadyExceptions {

}
    class FadyException extends RuntimeException{
     public FadyException(){
        super("Time for short break");
     }
         public FadyException(String message){
             super(message);
     }
}
