package SingletonPattern;

public class Animal {
    private static  Animal instance = null;
    //now we stopped other people to create instance of this class bcoz of private modifier
    private Animal(){
        System.out.println("Animal class instantiated");
    }

    public static Animal getAnimalInstance(){
        if(instance == null){
            synchronized (Animal.class){
                if(instance==null){
                    instance = new Animal();
                }
            }
        }
        return instance;
    }
}

//Double checking --> it is used to make sure the case of two threads executing at same  time .
