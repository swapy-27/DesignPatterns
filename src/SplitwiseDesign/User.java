package SplitwiseDesign;


import java.util.*;

public class User {

    private int id;
    private String name;

    private String number;
    private String email;

    private long total_balance;
    private List<Map<Integer,Integer>> balance;

    public User(int id, String name, String number, String email) {
        this.id = id;
        this.name = name;
        this.number = number;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getTotal_balance() {
        return total_balance;
    }

    public void setTotal_balance(long total_balance) {
        this.total_balance = total_balance;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getEmail() {
        return email;
    }



    public void setEmail(String email) {
        this.email = email;
    }

    public List<Map<Integer, Integer>> getBalance() {
        return balance;
    }

    public void setBalance(List<Map<Integer, Integer>> balance) {
        this.balance = balance;
    }
}
