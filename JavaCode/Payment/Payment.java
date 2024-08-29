package Payment;

import Payment.PaymentMode.PaymentMode;

public class Payment {
    PaymentMode paymentMode;

    public Payment(PaymentMode paymentMode) {
        this.paymentMode = paymentMode;
    }

    public boolean makePayment() {
        // api to handle payment logic
        paymentMode.makePayment();
        return true;
    }
}
