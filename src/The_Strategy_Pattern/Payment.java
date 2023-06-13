package The_Strategy_Pattern;

public interface Payment {
    void pay(double amount);
    boolean validateThePayment();
    void collectPaymentDetails();
}
