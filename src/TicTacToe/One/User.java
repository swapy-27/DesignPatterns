package TicTacToe.One;

public class User {

    private String name;
    private String shape;

    public User(String name,String shape){
        this.name = name;
        this.shape = shape;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }
}
