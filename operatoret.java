import java.util.Scanner;
public class operatoret {
    public static void main(String[] args) {
        //create a Scanner object to obtain input from the command line
        Scanner input = new Scanner(System.in);
        
        //create an Account object and assign it to myAccount
        operatoret myAccount=new operatoret();

        //display initial value of name (null)
        System.out.println("initial name is: %s%n%n", myAccount.getName());

        //prompt for and read name
        System.out.println("Please enter the name: ");
        String theName=input.nextLine();//read a line of text
        myAccount.setName(theName);//put theName in myAccount
        System.out.println();//output a blank line

        //display the name stored in object myAccount
        System.out.println("Name in object myAccount is: %n%s%n",myAccount.getName());
    }
}