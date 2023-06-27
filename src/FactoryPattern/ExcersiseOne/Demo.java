package FactoryPattern.ExcersiseOne;

public class Demo {

    public static void main(String[] args) {
        CourseFactory factory = new CourseFactory();
        Course hld = factory.createCourse("HLD");
        hld.getModules().stream().forEach(System.out::println);

        Course lld = factory.createCourse("LLD");
        lld.getModules().stream().forEach(System.out::println);
    }
}
