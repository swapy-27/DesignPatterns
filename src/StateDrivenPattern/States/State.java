package StateDrivenPattern.States;

public interface State {

    public void insertCoin(double amount);



    public void pressbutton(int aisleNumber);

    public void dispense(int aisleNumber);
}
