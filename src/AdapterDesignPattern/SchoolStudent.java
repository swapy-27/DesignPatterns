package AdapterDesignPattern;

public class SchoolStudent implements Student{
    private int id;
    private String name;

    public SchoolStudent(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public int getStudentID() {
        return id;
    }

    @Override
    public String getName() {
        return name;
    }
}
