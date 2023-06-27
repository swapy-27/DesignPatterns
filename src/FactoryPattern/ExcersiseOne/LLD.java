package FactoryPattern.ExcersiseOne;

public class LLD extends Course{

    @Override
    public void createCourse() {

        modules.add(new ConceptModule());
        modules.add(new DemoModule());
        modules.add(new IntroModule());


    }
}
