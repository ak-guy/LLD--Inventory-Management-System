package Cart;

import java.util.*;

public class Cart {
    public Map<Integer, Integer> productCategoryIDVsCount;

    public Cart() {
        productCategoryIDVsCount = new HashMap<>();
    }

    public void addItemToCart(int productCategoryID, int count) {
        if (productCategoryIDVsCount.containsKey(productCategoryID)) {
            int noOfItem = productCategoryIDVsCount.get(productCategoryID);
            productCategoryIDVsCount.put(productCategoryID, noOfItem+count);
        }else {
            productCategoryIDVsCount.put(productCategoryID, count);
        }
    }

    public void removeItemFromCart(int productCategoryID, int count) {
        if (productCategoryIDVsCount.containsKey(productCategoryID)) {
            int noOfItem = productCategoryIDVsCount.get(productCategoryID);
            if (noOfItem - count == 0){
                productCategoryIDVsCount.remove(productCategoryID);
            }else if (noOfItem < count) {
                productCategoryIDVsCount.put(productCategoryID, count-noOfItem);
            }else {
                System.out.println("Number of item to remove is greater than the quantity present in cart");
            }
        }else {
            System.out.println("Item not present in cart");
        }
    }

    public void emptyCart() {
        productCategoryIDVsCount = new HashMap<>();
    }

    public Map<Integer, Integer> showAllItems() {
        return productCategoryIDVsCount;
    }

}
