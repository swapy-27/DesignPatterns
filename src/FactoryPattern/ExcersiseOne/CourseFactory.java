package FactoryPattern.ExcersiseOne;

public  class CourseFactory
{

    public Course createCourse(String name){

        if(name.equals("HLD")){
            return new HLD();

        }else if (name.equals("LLD")){
            return new LLD();
        }

        return null;

    };

}
