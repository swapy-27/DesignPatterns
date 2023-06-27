package FactoryPattern.ExcersiseOne;

public class HLD extends Course{


    @Override
    public void createCourse() {
        modules.add(new SummaryModule());
        modules.add(new DemoModule());
        modules.add(new ConceptModule());

    }
}
