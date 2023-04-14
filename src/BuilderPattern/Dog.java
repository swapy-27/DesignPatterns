package BuilderPattern;

public class Dog
{

    private String name ;
    private String breed;
    private int age;

    public Dog(DogBuilder dogBuilder){
        name = dogBuilder.getName();
        breed= dogBuilder.getBreed();
        age=dogBuilder.getAge();
    }


    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", age=" + age +
                '}';
    }

   public static class DogBuilder{
       private String name ;
       private String breed;
       private int age;


        public Dog build(){
            return new Dog(this);
        }
       public DogBuilder setName(String name) {
           this.name = name;
           return this;
       }

       public DogBuilder setBreed(String breed) {
           this.breed = breed;
           return this;
       }

       public DogBuilder setAge(int age) {
           this.age = age;
           return this;
       }

       public String getName() {
           return name;
       }

       public String getBreed() {
           return breed;
       }

       public int getAge() {
           return age;
       }
   }
}
