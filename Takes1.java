package w3resource;
import java.util.Scanner;
public class Takes1 {
    public static void main(String[] args) {
        //write a java program that takes a number as input and prints its multiplication table upto 10

        Scanner in =new Scanner(System.in);
        System.out.println("Input the number: ");
        int num1 = in.nextInt();

        for (int i=0;i<10;i++){
            System.out.println(num1+"x"+(i+1)+"="+(num1*(i+1)));
        }
    }
}
