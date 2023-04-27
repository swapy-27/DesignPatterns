package StateDrivenPattern;

import StateDrivenPattern.Entities.Inventory;
import StateDrivenPattern.States.CoinInsertedState;
import StateDrivenPattern.States.DispenseState;
import StateDrivenPattern.States.NoCoinInsertedState;
import StateDrivenPattern.States.State;

public class VendingMachine implements State {
    private NoCoinInsertedState noCoinInsertedState;
    private CoinInsertedState coinInsertedState;
    private DispenseState dispenseState;
    private State current_state;
    private Inventory inventory;
    private double amount;
    private static final int Aisle_Count =2 ;

    public  VendingMachine(){
        noCoinInsertedState = new NoCoinInsertedState(this);
        coinInsertedState = new CoinInsertedState(this);
        dispenseState = new DispenseState(this);
        amount = 0.0;
        inventory = new Inventory(Aisle_Count);
        current_state = noCoinInsertedState;
    }

    @Override
    public String toString() {
        return "VendingMachine{" +
                "noCoinInsertedState=" + noCoinInsertedState +
                ", coinInsertedState=" + coinInsertedState +
                ", dispenseState=" + dispenseState +
                ", current_state=" + current_state +
                ", inventory=" + inventory.toString() +
                ", amount=" + amount +
                '}';
    }

    public boolean hasSuffAmount(double expectedAmount){
        return expectedAmount<=this.amount;
    }
    public NoCoinInsertedState getNoCoinInsertedState() {
        return noCoinInsertedState;
    }

    public void setNoCoinInsertedState(NoCoinInsertedState noCoinInsertedState) {
        this.noCoinInsertedState = noCoinInsertedState;
    }

    public CoinInsertedState getCoinInsertedState() {
        return coinInsertedState;
    }

    public void setCoinInsertedState(CoinInsertedState coinInsertedState) {
        this.coinInsertedState = coinInsertedState;
    }

    public DispenseState getDispenseState() {
        return dispenseState;
    }

    public void setDispenseState(DispenseState dispenseState) {
        this.dispenseState = dispenseState;
    }

    public State getCurrent_state() {
        return current_state;
    }

    public void setCurrent_state(State current_state) {
        this.current_state = current_state;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }


    @Override
    public void insertCoin(double amount) {
        this.getCurrent_state().insertCoin(amount);
    }

    @Override
    public void pressbutton(int aisleNumber) {

    }

    @Override
    public void dispense(int aisleNumber) {

    }
}
