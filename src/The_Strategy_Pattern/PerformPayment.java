package The_Strategy_Pattern;

public class PerformPayment {
    private double cost;
    private boolean deliveryNeeded;
    private Payment payment;

    public PerformPayment(Payment payment, double cost, boolean deliveryNeeded) {
        this.payment = payment;
        this.cost = cost;
        this.deliveryNeeded =deliveryNeeded;
    }

    public void processOrder(){
        payment.collectPaymentDetails();
        if (payment.validateThePayment()) {
            payment.pay(getTotalAmount());
        }
    }

    private double getTotalAmount(){
        return deliveryNeeded ? cost + 15 : cost;
    }
}
