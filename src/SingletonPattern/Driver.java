package SingletonPattern;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Driver {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(2);
       executorService.execute(()->Animal.getAnimalInstance());
        executorService.execute(()->Animal.getAnimalInstance());
    }
}
