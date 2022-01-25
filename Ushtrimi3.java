package Ushtrime1;

import java.util.Scanner;

public class Ushtrimi3 {
    public static void main(String[] args) {
        //
        Scanner in = new Scanner(System.in);
        String sw = in.nextLine();
        //switch case
        switch (sw) {
            case ("+"):
                System.out.println("Enter the number: ");
                int a = in.nextInt();
                System.out.println("Enter the number: ");
                int b = in.nextInt();
                System.out.println("The sum is: " + getSum(a, b));
                break;
            case ("-"):
                System.out.println("Enter the number: ");
                int c = in.nextInt();
                System.out.println("Enter the number: ");
                int d = in.nextInt();
                System.out.println("The subtraction is: " + getSubtraction(c, d));
                break;
            case ("*"):
                System.out.println("Enter the number: ");
                int e = in.nextInt();
                System.out.println("Enter the number: ");
                int f = in.nextInt();
                System.out.println("The multiplaction is: " + getMultiplication(e, f));
                break;
            case ("/"):
                System.out.println("Enter the number: ");
                int g = in.nextInt();
                System.out.println("Enter the number: ");
                int h = in.nextInt();
                System.out.println("The division is: " + getDivision(g, h));
            default:
                System.out.println("Not found!");
        }

    }
    //return method
    private static int getSum(int a, int b) {
        return a + b;
    }
    //return method
    private static int getSubtraction(int c, int d) {
        return c - d;
    }
    //return method
    private static int getMultiplication(int e, int f) {
        return e * f;
    }

    private static int getDivision(int g, int h) {
        return g / h;
    }


}
