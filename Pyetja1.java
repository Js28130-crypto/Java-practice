package Provim;

public class Pyetja1 {
    private int num1;
    private int num2;

    public Pyetja1(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public int sum(){
        int shuma=num1+num2;
        System.out.println("the sum is: "+shuma);
        if (shuma%2==0){
            System.out.println(shuma+" is even");
        }else
        {
            System.out.println(shuma+"is odd");
        }
        return shuma;

    }

    public static void main(String[] args) {
        Pyetja1 obj1=new Pyetja1(7,3);
        obj1.sum();
    }
}
