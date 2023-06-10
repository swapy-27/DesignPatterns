package strategy_design_pattern.strategy;

public class XYZDriveStrategy implements  DriverObject{
    @Override
    public void drive() {
        System.out.println("XYZ mode activated");
    }
};
