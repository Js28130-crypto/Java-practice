package W3Resource;

import java.util.Scanner;

public class Challenge1 {
    //1. Write a Java method to find the smallest number among three numbers. Go to the editor
    //Test Data:
    //Input the first number: 25
    //Input the Second number: 37
    //Input the third number: 29
    //Expected Output:
    //
    //The smallest value is 25.0

    private int num1;
    private int num2;
    private int num3;

    public Challenge1(int num1, int num2, int num3) {
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

    void smallNumber() {
        if (num1 < num2 && num1 < num3) {
            System.out.println("The smallest number is: " + num1);
        } else if (num2 > num1 && num2 > num3) {
            System.out.println("The smallest number is: " + num2);
        } else {
            System.out.println("The smallest number is: " + num3);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input the first number: ");
        int num1 = in.nextInt();
        System.out.println("Input the second number: ");
        int num2 = in.nextInt();
        System.out.println("Input the third number: ");
        int num3 = in.nextInt();

        Challenge1 obj1 = new Challenge1(num1, num2, num3);
        obj1.smallNumber();
    }
}
