package SplitwiseDesign;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Splitwise {
    //store user in hashmap with there id
    private Map<Integer,User> users;
    public Splitwise(Map<Integer, User> users) {
        this.users = new HashMap<>();
    }

    public void addUser(User user){
        if(user!=null) {
            users.put(user.getId(), user);
        }else{
            throw new NullPointerException("user cannot be null");
        }
    }
    //create expense --> Exact,Unequal,Percent,Equal
    public void createExpense(){

    }


    //getBalance(user_id)

    public void getBalance(int userId){
        if(!users.containsKey(userId)){
            throw new IllegalArgumentException("User ID is not valid");
        }else{
            User user = users.get(userId);
            List<Map<Integer,Integer>> userBalance = new ArrayList<>(user.getBalance());
            userBalance.stream().forEach(m-> System.out.println(m.toString()));
        }
    }

    //getAllBalance()
    public void getAllBalance(){
        if(users.size() ==0){
            System.out.println("all balance are cleared!");
        }else{
            users.values().stream().forEach((v)-> System.out.println(v.getName()+" = "+v.getBalance()));
        }

    }

}
