import java.util.Locale;
import java.util.Scanner;
public class Example11 {
   /* public static int sum(int x, int y){
        return x+y;
    }*/
    public static void main(String[] args) {
        //2d arraylist = a dynamic list of lists
        //you can change the size of these lists during runtime
        int i;
       /* System.out.println("message1");
        System.out.println(sum(1,2)+sum(3,5));
        System.out.println("message2");*/

        Scanner in = new Scanner(System.in);
        /*---------while loop------
        * System.out.println("Enter a number between 1 - 10: ");
        i=in.nextInt();
        while(i<0||i>10){
            System.out.println(i+" is not between 1 - 10");
            System.out.println("Try again:");
            i=in.nextInt();
        }
        System.out.println(i+" is between 1 - 10");
        * */

        /*--------- do while loop
        System.out.println("Enter a number between 1 - 10: ");
        i = in.nextInt();
        do {
            System.out.println(i+" is not between 1 - 10.");
            System.out.println("Try again: ");
            i=in.nextInt();
        }while(i<0||i>10);
        System.out.println(i+" is between 1 - 10.");

         */
        /*
        * for (i=1;i<100;i++){
            if (i%2!=0)
                System.out.println(i+" ");
        }
        * */
        /*for (i=1;i<100;i++){
            if (i%2==0)
                System.out.println(i+" ");
        }*/
       /* for (i=100;i>=1;i--){
            if (i%2!=0)
                System.out.println(i+" ");
        }*/
        /*for (i=100;i>=1;i--){
            if (i%2==0)
                System.out.println(i+" ");
        }*/
       /*
       *  int sum=0;
        while (true){
            System.out.println("enter a number: ");
            sum = sum+in.nextInt();

            if (sum>100)
                break;
        }
        System.out.println("done");
       * */


    }
}
