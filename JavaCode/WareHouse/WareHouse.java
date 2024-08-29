package WareHouse;

import Inventory.Inventory;
import Product.Product;
import java.util.*;

public class WareHouse {
    Inventory inventory;
    Address address;

    public WareHouse(Address address) {
        this.inventory = new Inventory();
        this.address = address;
    }

    public void removeItemFromInventory(Map<String, Product> productCategoryVsProduct) {
        inventory.removeProduct(productCategoryVsProduct);
    }

    public void addItemToInventory() {
        
    }
}
