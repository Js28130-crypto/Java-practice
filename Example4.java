import java.util.Scanner;
public class Example4 {
    public static void main(String[] args) {
      /*  double x = 3.14;
        double y=-10.2;

        //Math-minimum
        double z = Math.min(x,y);
        System.out.println(z);

        //Math-maximum
        double g=Math.max(x,y);
        System.out.println(g);*/
        double x;
        double y;
        double z;

        Scanner in = new Scanner(System.in);

        System.out.println("Enter side x: ");
        x =in.nextDouble();
        System.out.println("Enter side y: ");
        y=in.nextDouble();

        z=Math.sqrt((x*x)+(y*y));
        System.out.println("The hyptenuse is : "+z);

        in.close();



    }
}
