package strategy_design_pattern;

import strategy_design_pattern.strategy.SportsDriveStrategy;


public class Mustang extends Vehicle {
    Mustang(){
        super(new SportsDriveStrategy());
    }
}
