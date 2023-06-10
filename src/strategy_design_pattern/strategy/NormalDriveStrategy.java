package strategy_design_pattern.strategy;

public class NormalDriveStrategy implements DriverObject{
    @Override
    public void drive() {
        System.out.println("Normal mode activated");
    }
}
