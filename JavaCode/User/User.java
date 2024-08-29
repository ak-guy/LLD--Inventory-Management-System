package User;

import java.util.*;
import Cart.Cart;
import WareHouse.Address;

public class User {
    String userID;
    String userName;
    Address address;
    Cart userCartDetails;
    List<Integer> orderID;

    public User(String userID, String userName) {
        this.userID = userID;
        this.userName = userName;
        userCartDetails = new Cart();
        orderID = new ArrayList<>();
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Cart getUserCartDetails() {
        return userCartDetails;
    }

    public void setUserCartDetails(Cart userCartDetails) {
        this.userCartDetails = userCartDetails;
    }

    public List<Integer> getOrderID() {
        return orderID;
    }

    public void setOrderID(List<Integer> orderID) {
        this.orderID = orderID;
    }
     
} 
