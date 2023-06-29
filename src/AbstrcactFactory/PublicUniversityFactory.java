package AbstrcactFactory;

public class PublicUniversityFactory extends  UniversityFactory{
    @Override
    public AdmitCard getAdmitCard() {
        return null;
    }

    @Override
    public FeeCalculator getFee() {
        return null;
    }
}
