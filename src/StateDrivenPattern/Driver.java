package StateDrivenPattern;

import StateDrivenPattern.Entities.Inventory;
import StateDrivenPattern.Entities.Product;

import java.util.Scanner;

public class Driver {
    private static  VendingMachine vendingMachine = new VendingMachine();
    public static void main(String args[]){

        Inventory inventory = vendingMachine.getInventory();
        Product biscuits = new Product(1,"parleg","G-Maane-Genius",10);
        Product chips = new Product(2,"Balaji","masala-chips",10);

        inventory.addProduct(biscuits);
        inventory.addProduct(biscuits);
        inventory.addProduct(chips);
        inventory.addProduct(chips);
        inventory.addProduct(biscuits);
        inventory.addProduct(biscuits);
        inventory.addProduct(chips);
        inventory.addProduct(chips);

       Scanner sc = new Scanner(System.in);
        System.out.println("Enter the coin");
        double amount = sc.nextInt();
        vendingMachine.insertCoin(amount);
    }
}
