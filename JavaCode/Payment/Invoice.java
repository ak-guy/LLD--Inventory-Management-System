package Payment;

import Order.Order;

public class Invoice {
    int totalItemPrice;
    int totalTax;

    public void generateInvoice(Order order) {
        totalItemPrice = 200;
        totalTax = 32;
    }
}
