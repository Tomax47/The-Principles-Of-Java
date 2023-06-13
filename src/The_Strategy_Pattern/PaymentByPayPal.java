package The_Strategy_Pattern;

public class PaymentByPayPal implements Payment{

    private final String email;
    private final String password;

    public PaymentByPayPal(String email, String password) {
        this.email = email;
        this.password = password;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Payment is being processed through the email "+email+", with the value of : "+amount+"$");
    }

    @Override
    public boolean validateThePayment() {
        return true;
    }

    @Override
    public void collectPaymentDetails() {
        System.out.println("Email : "+email+"\nPassword : "+password);
    }
}
