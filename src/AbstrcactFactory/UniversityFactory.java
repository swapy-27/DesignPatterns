package AbstrcactFactory;

public abstract class UniversityFactory {

   private  static int CUTOFF = 100;

   private UniversityFactory getUniversity(String courseName , int cutOff){
      if(cutOff<100){
         return new PrivateUniversityFactory(courseName);
      }else{
         return new PublicUniversityFactory(courseName);
      }
   }

   public abstract AdmitCard getAdmitCard();
   public abstract  FeeCalculator getFee();

}
