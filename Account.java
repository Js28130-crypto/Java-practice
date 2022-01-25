public class Account {
    private String name;//instanc variable
    private double balance;//instanc variable

    //Account constructor that recieves two parameteres
    public Account(String name, double balance){
        this.name = name; //assign name to instance variable name

        //validate that the balance is greater than 0,0; if it's not,
        //instance variable balance keept its default initial value of0,0
        if(balance>0.0)//if the balance is valid
            this.balance = balance;//assign it to instance variable balance
    }

    //method that deposits (adds) only a valid amount to the balance
    public void deposit(double depositAmount){
        if(depositAmount>0.0)//if the depositAmount is valid
            balance=balance+depositAmount;//add it to the balance
    }

    //method returns the account balance
    public double getBalance(){
        return balance;
    }

    //method that sets the name
    public void setName(String name){
        this.name=name;
    }
    //method that returns the name
    public String getName(){
        return  name;// give value of name back to caller
    }
}
