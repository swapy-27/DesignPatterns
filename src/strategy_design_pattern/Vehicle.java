package strategy_design_pattern;

import strategy_design_pattern.strategy.DriverObject;

public class Vehicle {
    private DriverObject driverObject ;

    public Vehicle() {
    }

    Vehicle(DriverObject driverObject){
        this.driverObject=driverObject;
    }
    public void drive(){
        driverObject.drive();
    }
}
