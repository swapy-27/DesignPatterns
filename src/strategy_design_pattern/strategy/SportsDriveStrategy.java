package strategy_design_pattern.strategy;

public class SportsDriveStrategy implements  DriverObject{
    @Override
    public void drive() {
        System.out.println("sports mode activated");
    }
}
