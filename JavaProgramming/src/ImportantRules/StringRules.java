package ImportantRules;

public class StringRules {

        public static void main(String[] args) {
        /*
        1. Create a class named SumTwoNumber, write a Java program to print
        the sum of two numbers.
         */
            //declare first variable
            int firstNumber=10;

            //declare the second Variable
            int secondNumber=20;

            //adding two variable and assign in another variable
            int sum=firstNumber+secondNumber;

            //print the result

            System.out.println(sum);
            System.out.println("sum = " + sum);

            //firstNumber+secondNumber=sum(value)
            System.out.println(firstNumber+"+"+secondNumber+"="+sum); //30
            System.out.println(firstNumber+"+"+secondNumber+"="+firstNumber+secondNumber);//10+20=1020
            System.out.println(firstNumber+"+"+secondNumber+"="+(firstNumber+secondNumber));//10+20=30

            int a = 20;
            String s="30";
            System.out.println(s+a);//3020
            System.out.println(a+s);//2030

        }
    }


