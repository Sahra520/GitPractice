package day16_ForLoopStringPractice;

public class WarmupTasks {

    public static void main(String[] args) {

        String word = "Cydeo";
        int firstletter = word.indexOf("C");
        System.out.println(firstletter);

        System.out.println(word.charAt(firstletter));
        String x = "" + word.charAt(firstletter);
        System.out.println(x);
        /*
Page
1
of 2
1. Write a program that asks user to enter number for 5 times, and print
how many positive and negative numbers user entered
Ex:
Inputs:
10
20
-1
0
3
Output:
3 positive and 1 negative
2. Write a program that asks user to enter a string and a char, the
returns the frequency of the char from the given string
Ex:
inputs:
str = "aabcccd";
char = 'c';
output: 3
inputs:
"Java programming language"
'g'
output: 4
3. Write a program that asks user to enter two positive numbers,
then multiply those two numbers without using multiplication (*)
operator.
if user enters any negative numbers, print Invalid
Ex:
inputs:
10
20
output:
200
4. write a program that can return the frequency of the  word Java from
the sentence
Ex:
sentence = "Java Java";
output:
2
Hint: you need to create
5. write a program to print true if the string "cat" and "dog" appear the
same number of times in the given sentence
        Ex:
            sentence = "caT dog dogG cAt"
            output:
                true
         */
    }
}
