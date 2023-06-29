package SingletonPattern.excersise;

import SingletonPattern.Animal;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Demo {

    public static void main(String[] args) {
//
//        Calendar calendar1 = Calendar.   getCalendar();
//        Calendar calendar2 =Calendar.getCalendar();
//        Calendar calendar3 =Calendar.getCalendar();
//
//        System.out.println(calendar1.toString()+" "+ calendar2.toString() +" " + calendar3.toString());

        ExecutorService executorService = Executors.newFixedThreadPool(2);
        executorService.execute(()-> Calendar.getCalendar());
        executorService.execute(()->Calendar.getCalendar());
    }
}
