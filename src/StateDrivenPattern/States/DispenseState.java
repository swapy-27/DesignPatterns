package StateDrivenPattern.States;

import StateDrivenPattern.Entities.Inventory;
import StateDrivenPattern.Entities.Product;
import StateDrivenPattern.VendingMachine;

public class DispenseState implements  State {
    private VendingMachine vendingMachine;
    public DispenseState(VendingMachine vendingMachine) {
        this.vendingMachine=vendingMachine;
    }

    @Override
    public void insertCoin(double amount) {
        throw new IllegalArgumentException("Product getting dispensed");
    }

    @Override
    public void pressbutton(int aisleNumber) {
        throw new IllegalArgumentException("Product getting dispensed");
    }

    @Override
    public void dispense(int aisleNumber) {
        Inventory inventory = vendingMachine.getInventory();
        Product product = inventory.getProduct(aisleNumber);
        inventory.deductProductCount(aisleNumber);
        vendingMachine.setAmount(0.0);
        vendingMachine.setCurrent_state(vendingMachine.getNoCoinInsertedState());
        System.out.println("Enjoy buddy " + product.toString());
    }
}
