package AdapterDesignPattern;

public class CollegeStudent {
    private int id;
    private String name;
    public CollegeStudent(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getStudentID() {
        return id;
    }


    public String getName() {
        return name;
    }
}
