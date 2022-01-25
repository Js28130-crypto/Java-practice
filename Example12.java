import java.util.Scanner;

public class Example12 {
    public static void main(String[] args) {
        System.out.println("Enter your name: ");
        System.out.println(getName());
        System.out.println("Enter your age: ");
        System.out.println(getAge());
    }
    public static String getName(){
        Scanner in=new Scanner(System.in);

        String name = in.nextLine();
        return name;
    }
    public static int getAge(){
        Scanner inn=new Scanner(System.in);

        int age = inn.nextInt();
        return age;
    }
}
