package Order;

import WareHouse.Address;
import WareHouse.WareHouse;
import User.User;
import java.util.*;
import Enums.OrderStatus;
import Payment.Invoice;
import Payment.Payment;
import Payment.PaymentMode.PaymentMode;
import Payment.PaymentMode.UPIPaymentMode;

public class Order {
    String orderID;
    User user;
    Address deliveryAddress;
    Map<Integer, Integer> productCategoryIDVsCount;
    WareHouse wareHouse;
    Invoice invoice;
    Payment payment;
    OrderStatus orderStatus;

    public Order(String orderID, User user, WareHouse wareHouse) {
        this.orderID = orderID;
        this.user = user;
        this.wareHouse = wareHouse;
        this.deliveryAddress = user.getAddress();
        invoice = new Invoice();
        invoice.generateInvoice(this);
        this.productCategoryIDVsCount = user.getUserCartDetails().productCategoryIDVsCount;
    }

    public void checkout() {
        wareHouse.removeItemFromInventory(productCategoryIDVsCount);
        boolean isPaymentSuccess = makePayment(new UPIPaymentMode());

        if (isPaymentSuccess) {
            user.getUserCartDetails().emptyCart();
        }else {
            wareHouse.addItemToInventory(productCategoryIDVsCount);
        }
    }

    public boolean makePayment(PaymentMode paymentMode) {
        Payment payment = new Payment(paymentMode);
        return payment.makePayment();
    }

    public void generateOrderInvoice() {
        invoice.generateInvoice(this);
    }
}
