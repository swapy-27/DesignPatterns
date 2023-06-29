package AbstrcactFactory;

public class PrivateUniversityFactory extends UniversityFactory {
    PrivateUniversityFactory(String coureName){
        switch (coureName){
            case "MBA":
                return new Symboisis();
        }

    }

}
