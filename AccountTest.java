import java.util.Scanner;
public class AccountTest {
    public static void main(String[]args){
        Account account1=new Account("Jakup Sinani",50.00);
        Account account2=new Account("Kaltrina Sinani",-7.53);

        //display initial balance of each object
        System.out.printf(" balance ",account1.getName(),account1.getBalance());
        System.out.printf("%s balnace: $%.2f%n%n",account2.getName(),account2.getBalance());

        //create a scanner to obtain input from the command view
        Scanner input = new Scanner(System.in);

    }
}
