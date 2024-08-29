package WareHouse;

import Inventory.Inventory;
import java.util.*;

public class WareHouse {
    Inventory inventory;
    Address address;

    public WareHouse(Address address) {
        this.inventory = new Inventory();
        this.address = address;
    }

    public void removeItemFromInventory(Map<Integer, Integer> productCategoryVsProduct) {
        inventory.removeProduct(productCategoryVsProduct);
    }

    public void addItemToInventory(Map<Integer, Integer> productCategoryIDVsCount) {
        // to implement
    }
}
