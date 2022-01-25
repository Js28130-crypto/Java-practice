package w3resource;
import java.util.Scanner;

public class Takes {
    public static void main(String[] args) {
        //write a java program that takes two numbers as input and display the product of two numbers
        Scanner in = new Scanner(System.in);
        System.out.println("Input the first number");
        int num1 = in.nextInt();

        System.out.println("Input the second number");
        int num2 = in.nextInt();

        System.out.println(num1 + "*"+ num2 + "=" + num1 * num2);

    }
}
