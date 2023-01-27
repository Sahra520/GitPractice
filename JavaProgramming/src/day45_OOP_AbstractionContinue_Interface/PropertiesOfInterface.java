package day45_OOP_AbstractionContinue_Interface;

public interface PropertiesOfInterface {

    int a = 100; //static and final by default

    static int b = 200; //final by default

  /* public PropertiesOfInterface(int a){
        this.a = a;
    } */

  /*  static {
        b = 100;
    }
*/

   /*
   public void method1(){
        System.out.println("Instance method");
    }
*/

    public static void method2(){
        System.out.println("Static method");
    }


    public abstract void method3();

    public default void method4(){
        System.out.println("Default method");
        //in order the implementation(println) we can use default specifier
    }


    default  void method(){
        System.out.println("Default method which allows to create the method with the implementation");
    }

}

class Test implements PropertiesOfInterface{


    @Override
    public void method3() {
    }

    public static void main(String[] args) {

        new Test().method4();

        new Test().method();

        new Test().method3();

     //we can not create objects from interface because interface is not class
      //  new Test().method2();
    }









}