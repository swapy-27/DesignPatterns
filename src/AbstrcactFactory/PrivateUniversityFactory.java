package AbstrcactFactory;

public class PrivateUniversityFactory extends UniversityFactory {
    @Override
    public AdmitCard getAdmitCard() {
        return null;
    }

    @Override
    public FeeCalculator getFee() {
        return null;
    }
//    PrivateUniversityFactory(String coureName){
//        switch (coureName){
//            case "MBA":
//                return new Symboisis();
//        }
//
//    }

}
