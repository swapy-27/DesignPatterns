package BuilderPattern;

public class Driver {
    public static void main(String[] args) {
        Dog dog = new Dog.DogBuilder().setName("Moofy").setBreed("Lebra").setAge(7).build();
        System.out.println(dog.toString());
    }
}
