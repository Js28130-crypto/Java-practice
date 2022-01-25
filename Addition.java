package w3resource;
import java.util.Scanner;
public class Addition {
    public static void main(String[] args) {
        //write a java program to print the sum (addition), mulitply substract divide and remainder of two numbers.

        Scanner in = new Scanner(System.in);

        System.out.println("Input first number: ");
        int num1 = in.nextInt();
        System.out.println("Input second number: ");
        int num2 = in.nextInt();

        //sum
        System.out.println(num1+"+"+num2+"="+(num1+num2));
        //subtract
        System.out.println(num1+"-"+num2+"="+(num1-num2));
        //multiply
        System.out.println(num1+"*"+num2+"="+(num1*num2));
        //division
        System.out.println(num1+"/"+num2+"="+(num1/num2));


    }

}
