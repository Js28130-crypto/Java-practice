package W3Resource;

import java.util.Scanner;

public class Challenge2 {
    private int num1;
    private int num2;
    private int num3;

    public Challenge2(int num1, int num2, int num3) {
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public int getNum3() {
        return num3;
    }

    public void setNum3(int num3) {
        this.num3 = num3;
    }

    public void getAverage() {
        System.out.println("The average is: " + (num1 + num2 + num3) / 3);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input the first number: ");
        int num1 = in.nextInt();
        System.out.println("Input the second number: ");
        int num2 = in.nextInt();
        System.out.println("Input the third number: ");
        int num3 = in.nextInt();
        Challenge2 obj1 = new Challenge2(num1, num2, num3);
        obj1.getAverage();
    }
}