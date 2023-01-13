package day42_Exceptions;

public class MorningWorkOut {

    public static void main(String[] args) {

        System.out.println("----------------------Push up started---------------------");

        for (int i = 1; i <= 30; i++) {
            System.out.print("\rPush up " + i);
            sleep(3.0);
        }
        System.out.println("\n----------------------Push ups completed---------------------");

        System.out.println("****************************************************************************");

        System.out.println("----------------------Pull up started---------------------");

        for (int i = 1; i <= 20; i++) {
            System.out.print("\rPull up " + i);
           sleep(2.5);
        }
        System.out.println("\n----------------------Pull ups completed---------------------");



    }

    public static void sleep(double seconds){
        try {
            Thread.sleep((long)(seconds*1000));
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
/*
MorningWorkOut:
1. Do 30 push-ups and try pausing 1.5 seconds in each
2. Do 20 pull-ups and try pausing 2.5 seconds in each
 */