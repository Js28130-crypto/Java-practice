

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class index {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner in = new Scanner(System.in);
        HashMap<String , Long> Personi = new HashMap<String, Long>();
        long start=0,stop=0,time;
        String name = "a";
        boolean startstop;

        int num,choose;
        do {
            System.out.print("1:Register\n2:LogIn\n0:Exit\t-> ");
            num = in.nextInt();
            if(num == 1) {
                boolean out = false;
                do {
                    System.out.print("Enter your name: ");
                    name = in.next();
                    if(Personi.containsKey(name) == false) {
                        Personi.put(name, start);
                        System.out.println("Registered Succesfuly\n");
                        out = true;
                    } else {
                        System.out.println("The name already exist! Try again...");
                        out = true;
                    }
                }while(out == false);

            }else if(num == 2) {
                System.out.print("User: ");
                name = in.next();
                if(Personi.containsKey(name) == true) {

                    System.out.print("1:Start\t2:Stop\t3:Check\t0:Exit\t-> ");
                    choose = in.nextInt();
                    if(choose == 1 && start < 10000) {
                        Personi.replace(name, start = System.currentTimeMillis());
                    }else if(choose == 2 && start > 10000) {
                        stop = System.currentTimeMillis();
                        stop = stop - start;
                        Personi.replace(name, stop);
                        stop = 0;
                    }else if(choose == 3) {
                        System.out.println(Personi);
                    }
                }else {System.out.println("This User Doesnt Exist!\n");}


            }
        }while(num != 0);
        System.out.println(Personi);




    }
}

// System.out.print("Do You Want To Stop Working?\n1:Yes\n2:No\t-> ");
// choose = in.nextInt();
// if(choose == 1) {
// stop = System.currentTimeMillis();
// }