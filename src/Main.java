public class Main {
  public static void main(String[] args){

    Drink drink1 = new Drink("coffe",250.0);
    Order order1 = new Order(drink1,10);
    order1.printReceipt();

  }
}