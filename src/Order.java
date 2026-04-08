public class Order {
    private Drink drink;
    private int quantity;

    public Order(Drink drink,int quantity){
        this.drink = drink;
        this.quantity =quantity;
    }

    public double getTotalcost(){
        double total = drink.getPrice()* quantity;
        return total;

    }
    public void printReceipt(){
        System.out.println("*************************************");
        System.out.println("The drink is "+drink.getName());
        System.out.println("The price is "+drink.getPrice()+" "+"Rupees");
        System.out.println("Quantity is "+quantity);
        System.out.println("Total Amount is "+getTotalcost());
        System.out.println("*************************************");


    }
}
