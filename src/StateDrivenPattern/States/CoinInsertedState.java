package StateDrivenPattern.States;

import StateDrivenPattern.Entities.Inventory;
import StateDrivenPattern.Entities.Product;
import StateDrivenPattern.VendingMachine;

public class CoinInsertedState implements State {
    private VendingMachine vendingMachine;
    public CoinInsertedState(VendingMachine vendingMachine) {
       this.vendingMachine=vendingMachine;
    }


    @Override
    public void insertCoin(double amount) {
        double curr_amount = vendingMachine.getAmount();
        vendingMachine.setAmount(amount+curr_amount);
    }

    @Override
    public void pressbutton(int aisleNumber) {
        Inventory inventory = vendingMachine.getInventory();
        Product product = inventory.getProduct(aisleNumber);
        if(!inventory.checkProductAvailability(aisleNumber)){
          throw new IllegalArgumentException("Product not available");
        }
        if(vendingMachine.getAmount()<product.getAmount()){
            throw new IllegalArgumentException("Amount is not sufficient");
        }

        vendingMachine.setCurrent_state(vendingMachine.getDispenseState());

    }

    @Override
    public void dispense(int aisleNumber) {
            throw new IllegalArgumentException("please press button");
    }
}
