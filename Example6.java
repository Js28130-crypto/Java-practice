import java.util.Scanner;
public class Example6 {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
        /*&& = (and) both conditions must be true
        int temp = 30;
        if (temp>35){
            System.out.println("It's so hot");
        }else
        {
            System.out.println("It's not so hot");
        }
        if(temp>=20&&temp<=30){
            System.out.println("The temperature is average");
        }
        * */

        /* ||=(or) either condition must be true

        *
        System.out.println("You are playing a game! Press q or Q to quit");
        String response = in.next();

        if (response.equals("q")||response.equals("Q")){
            System.out.println("You quit the game");
        }else
        {
            System.out.println("You are still playing the game *pew pew*");
        }
        * */

        System.out.println("You are playing a game! Press q or Q to quit");
        String response = in.next();

        if (!response.equals("q")&&!response.equals("Q")){
            System.out.println("You are still playing the game *pew pew*");

        }else
        {
            System.out.println("You quit the game");
        }
    }
}
