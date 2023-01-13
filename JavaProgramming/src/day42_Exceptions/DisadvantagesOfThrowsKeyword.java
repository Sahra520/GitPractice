package day42_Exceptions;

public class DisadvantagesOfThrowsKeyword {

    public static void main(String[] args) {
        System.out.println("hello");
        try {
            sleep(2.5); //throws keyword
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Hello world");
        System.out.println("---------------------");

        System.out.println("Hello");
        MorningWorkOut.sleep(3.5);//try & catch
        System.out.println("Cydeo");
    }

    public static void sleep(double seconds) throws InterruptedException {

        Thread.sleep((long) (seconds * 1000));
    }

}
