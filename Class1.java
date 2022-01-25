public class Class1 {
    int first;
    int second;
    int third;


    //constructor which will be used while creating complex number
    public Class1(int f, int s,int th){
        this.first=f;
        this.second=s;
        this.third=th;
    }
    public void showC(){
        System.out.println(this.first+" +i"+this.second);
    }
    //function to print real number
    public static Class1 add(Class1 n1, Class1 n2,Class1 n3){
        //creating blank complex number
        //to store result
        Class1 res = new Class1(0,0,0);
        //adding real parts of both complex numbers
        res.first=n1.first+n2.first+n3.first;
        //adding imaginary parts
        res.second=n1.second+ n2.second+n3.second;
        res.third=n1.third+n2.third+ n3.third;
        //returning result
        return res;
    }
    public static void main(String[] args) {
    Class1 a = new Class1(3,5,0);
        System.out.println(a);
        Class1 b =new Class1(-2,0,0);
        System.out.println(b);
        Class1 c = a.add(b);
        System.out.println(c);
        System.out.println(c.getFirst());
        System.out.println(a.getSecond());

    }

    private void add(int i) {

    }

    private int getSecond() {
        return 0;
    }

    private boolean getFirst() {

        return false;
    }

    private Class1 add(Class1 b) {

        return b;
    }
}