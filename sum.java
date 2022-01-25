package Example;

public class sum {
   /* public static void main(String[] args) {
        int orig=42;
        sum x =new sum();
        int y=x.go(orig);
        System.out.println(orig+" "+y);
    }
    int go(int arg){
        arg=arg*2;
        return arg;
    }*/
    String time;

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public static void main(String[] args) {
        sum c =new sum();
        c.setTime("1245");
        String tod=c.getTime();
        System.out.println("time: "+tod);
    }
}
