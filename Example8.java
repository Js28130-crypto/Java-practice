import java.util.Scanner;
public class Example8 {
    public static void main(String[] args) {
        int rows;
        int columns;
        String symbols="";
        Scanner in = new Scanner(System.in);

        System.out.println("Enter # of rows: ");
        rows=in.nextInt();
        System.out.println("Enter # of columns");
        columns=in.nextInt();
        System.out.println("Enter symbol to use: ");
        symbols=in.next();

        for (int i=1;i<=rows;i++){
            System.out.println();
            for (int j =1;j<=columns;j++){
                System.out.print(symbols);
            }
        }


    }
}
