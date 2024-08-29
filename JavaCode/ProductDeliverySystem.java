import Order.OrderController;
import User.User;
import User.UserController;
import WareHouse.WareHouse;
import WareHouse.WareHouseController;
import WareHouse.WareHouseSelectingStrategy.NearestWareHouseSelectingStrategy;
import java.util.*;

import Inventory.Inventory;

public class ProductDeliverySystem {
    UserController userController;
    WareHouseController wareHouseController;
    OrderController orderController;

    public ProductDeliverySystem(List<User> userList, List<WareHouse> wareHouseList) {
        this.userController = new UserController(userList);
        this.wareHouseController = new WareHouseController(wareHouseList, null);
    }

    public User getUser(int userId) {
        return userController.getUser(userId);
    }

    public WareHouse getWareHouse(int wareHouse) {
        return wareHouseController.getWareHouse(new NearestWareHouseSelectingStrategy());
    }

    public Inventory getWareHouseInventory(WareHouse wareHouse) {
        return wareHouse.inventory;
    }
}
