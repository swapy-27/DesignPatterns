import concreteclasses.*;

public class GlobalNegativeResProcessor {
    private NegativeResponse currentState;

   public  void process(String exchange){
       String JsonNode = "";

       switch (exchange){
           case "acclookup":
               currentState=new AccLookUp();
               break;
           case "flexrate":
               currentState=new FlexRate();
               break;
           case "accposting":
               currentState=new AccPosting();
               break;
           case "balinq":
               currentState=new Balinq();
               break;
       }
       // pass Json Node reference here
       currentState.setCommunicationHeaders();
       currentState.setExtendedAttributes();
       currentState.setUdfDetails();
       currentState.setResponseDetails();
        // u will get an updated payload


   }


}
