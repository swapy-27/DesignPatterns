package StateDrivenPattern.States;

import StateDrivenPattern.VendingMachine;

public class DispenseState implements  State {
    private VendingMachine vendingMachine;
    public DispenseState(VendingMachine vendingMachine) {
        this.vendingMachine=vendingMachine;
    }

    @Override
    public void insertCoin(double amount) {

    }

    @Override
    public void pressbutton(int aisleNumber) {

    }

    @Override
    public void dispense(int aisleNumber) {

    }
}
