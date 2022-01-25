package Example;

public class Test1 {
    public static void main(String[] args) {
        //instanc variabla
        int times=3;
        System.out.println("Before the call,"+"variable time is "+times);

        //invoke nPrintln and display times
        nPrintln("Welcome to Java!",times);
        System.out.println("After the call,"+" variable time is "+times);
    }
    //metoda      parametrat
    public static void nPrintln(String message,int n){
        while (n>0){
            System.out.println("n= "+n);
            System.out.println(message);
            n--;
        }
    }
}
