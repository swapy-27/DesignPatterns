package StateDrivenPattern.Entities;

public class Product {
    private int Id;
    private String name ;
    private String description;

    public Product(int id, String name, String description, int amount) {
        Id = id;
        this.name = name;
        this.description = description;
        this.amount = amount;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    private int amount;
}
