package StateDrivenPattern.Entities;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class Inventory {

    private Map<Integer,Product> aisleNoToProductMap ;
    private Map<Integer,Integer> productIdToQuantityMap ;
    private Queue<Integer> availableAisle;


    public Inventory(int aisleCount){
        this.aisleNoToProductMap=new HashMap<>();
        this.productIdToQuantityMap=new HashMap<>();
        this.availableAisle=new LinkedList<>();

        for( int  i =1 ; i<=aisleCount ; i++){
            availableAisle.add(i);
        }
    }

    public void addProduct(Product product){

        //if productCount ==0  then new aisle should be created
        //else add product into current isle
        //else no isle is empty throw error
        int productID = product.getId();
        int productQuantity = productIdToQuantityMap.getOrDefault(productID,0);
        if(0==productQuantity){
            if(availableAisle.isEmpty()){
                throw new IllegalArgumentException("Out of space");
            }
            int aisleNo = availableAisle.poll();
            aisleNoToProductMap.put(aisleNo,product);
            productIdToQuantityMap.put(productID,1);
        }
        else{
            productIdToQuantityMap.put(productID,productQuantity+1);
        }

    }

    public Boolean checkProductAvailability(int aisleNumber){
        Product product = aisleNoToProductMap.get(aisleNumber);
        int quantity = productIdToQuantityMap.get(aisleNumber);
        return quantity>0;
    }

    public void deductProductCount(int aisleNumber){
        Product product = aisleNoToProductMap.get(aisleNumber);
        int productId = product.getId();
        int productQuantity=productIdToQuantityMap.getOrDefault(productId,0);
        if(productQuantity!=0){
            productIdToQuantityMap.put(productId,productQuantity-1);
        }
    }
}
