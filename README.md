# Coffee-Shop-System
# Java Drink & Order System

## Description
This is a simple Java project that simulates a **drink ordering system**.  
It demonstrates basic object-oriented programming concepts such as **classes, objects, constructors, and methods**.

The project includes two main classes:
- `Drink` – Represents a drink with a name and price.
- `Order` – Represents an order with a drink and quantity, calculates the total cost, and prints a receipt.

## Features
- Create drinks with name and price
- Place orders with specific quantities
- Calculate total cost of an order
- Print a receipt to the console
  
## Technologies
- Java

## Author
Kaveesha Perera

## Example Usage

```java
public class Main {
    public static void main(String[] args){
        Drink drink1 = new Drink("Coffee", 250.0);
        Order order1 = new Order(drink1, 10);
        order1.printReceipt();
    }
}


