package Invoicee;

public class Invoice {
    private String number;
    private String description;
    private int quantity;
    private double price;

    public Invoice(String number, String description, int quantity, double price) {
        this.number = number;
        this.description = description;
        this.quantity = quantity;
        this.price = price;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;

    }

    @Override
    public String toString() {
        return
                "number='" + number + '\'' +"\n"+
                "description='" + description + '\'' +"\n"+
                "quantity=" + quantity +"\n"+
                "price=" + price +
                "\n"+"\n"+"The price is: "+getInstanceAmount()+"$";
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    double getInstanceAmount(){
        double amount=quantity*price;
        return amount;
    }
}
