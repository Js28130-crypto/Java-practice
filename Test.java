package Example;

public class Test {
    public static void main(String[] args) {
        //instance variable
        int i=1;
        //kushti
        while (i<=6){
            //thirja e metodes
            method1(i,2);
            //increment
            i++;
        }

    }
    //method                   2-parameter
    public static void method1(int i,int num){
        //kushti
        for (int j=1;j<=1;j++){
            //shfaqja e mesaxhit
            System.out.println(num+" ");
            //ritja e numrit * 2
            num*=2;
        }
        System.out.println();
    }
}
