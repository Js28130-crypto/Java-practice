public class Example1 {
    public static void main(String[] args) {
    String x = "Water";
    String y = "Cola";
    String temp;

        temp=x;
        x=y;
        y=temp;


        System.out.println("X: "+x);
        System.out.println("Y: "+y);
    }
}
