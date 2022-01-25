package w3resource;
import java.util.Scanner;
public class PrintArea {
    public static void main(String[] args) {
        //write a java program to print the area and perimeter of a rectangle
        Scanner in = new Scanner(System.in);
        System.out.println("Input width: ");
        double width = in.nextDouble();
        System.out.println("Input height: ");
        double height = in.nextDouble();

        System.out.println("Area is"+(width*height));
        System.out.println("Perimeter is: "+(2*(width+height)));
    }
}
