package SingletonPattern.excersise;

public class Calendar {


    private static volatile   Calendar instance = null ;
    private Calendar(){
        System.out.println("Calendar instantiated");
    };
    public static Calendar getCalendar(){

         if (instance==null) {
        synchronized (Calendar.class){
            if(instance==null){
                instance = new Calendar();
            }
        }
     }
        return instance;
    }
}
