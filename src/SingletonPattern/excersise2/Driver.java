package SingletonPattern.excersise2;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class Driver {

    public static void main(String[] args) {
//        Vehicle vehicle =  Vehicle.getVehicle();
//        System.out.println(vehicle.hashCode());
//        Vehicle vehicle1 =Vehicle.getVehicle();
//        System.out.println(vehicle1.hashCode());


        ExecutorService executorService = Executors.newFixedThreadPool(4);
        executorService.execute(()->Vehicle.getVehicle());
        executorService.execute(()->Vehicle.getVehicle());
        executorService.execute(()->Vehicle.getVehicle());
        executorService.execute(()->Vehicle.getVehicle());

    }
}
