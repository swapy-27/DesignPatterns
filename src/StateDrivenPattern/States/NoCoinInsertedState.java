package StateDrivenPattern.States;

import StateDrivenPattern.VendingMachine;

public class NoCoinInsertedState implements  State {
    private VendingMachine vendingMachine;
    public NoCoinInsertedState(VendingMachine vm){
        this.vendingMachine=vm;
    }
    @Override
    public void insertCoin(double amount) {
        vendingMachine.setCurrent_state(vendingMachine.getCoinInsertedState());
        vendingMachine.setAmount(amount);
    }

    @Override
    public void pressbutton(int aisleNumber) {
        throw new IllegalArgumentException("No coin is inserted");
    }

    @Override
    public void dispense(int aisleNumber) {
        throw new IllegalArgumentException("No coin is inserted");
    }
}
