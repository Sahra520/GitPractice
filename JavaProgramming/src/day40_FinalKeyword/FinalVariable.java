package day40_FinalKeyword;

public class FinalVariable {

    final String birthDay; //without constructor giving compile error

    final static String name;
    static {
        name = "Batch25";
    }

    public FinalVariable(String birthDay) {
        this.birthDay = birthDay;
    }

    public static void main(String[] args) {

        final double pi = 3.14;

        System.out.println("  ");

        FinalVariable obj = new FinalVariable("May/21");

        //obj.birthDay = "June/01"; //final variables can not be reassigned

        System.out.println(obj.birthDay);

        System.out.println(" ");

        System.out.println(name);
        //FinalVariable.name = "Python";//we can not reassign final variable

    }
}
