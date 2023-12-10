package SingletonPattern.excersise2;

public class Vehicle {

    private static volatile  Vehicle instance = null;

    private Vehicle(){
        System.out.println("A new Vehicle has been instantiated!");
    }


    public  static  Vehicle getVehicle(){
//    synchronized (Vehicle.class){
        if( instance == null){
            synchronized (Vehicle.class){
                instance = new Vehicle();
            }

        }
//    }

       return instance;

    }

}
