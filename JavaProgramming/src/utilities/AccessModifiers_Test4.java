package utilities;

import day40_FinalKeyword.ProtectedAccessModifier;

public class AccessModifiers_Test4 extends ProtectedAccessModifier {

    public static void main(String[] args) {

       //System.out.println(AccessModifiers_Test4.name1);//default is not visible outside the package
        System.out.println(AccessModifiers_Test4.name2);//protected is visible outside the package IN subclass only

        //AccessModifiers_Test4.method1();//default is not visible outside the package
        AccessModifiers_Test4.method2();//protected is visible outside the package IN subclass only
    }
}
