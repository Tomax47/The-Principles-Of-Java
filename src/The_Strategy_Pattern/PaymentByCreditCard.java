package The_Strategy_Pattern;

public class PaymentByCreditCard implements Payment{

    private CreditCard creditCard;

    public PaymentByCreditCard(CreditCard creditCard) {
        this.creditCard = creditCard;
    }

    @Override
    public void pay(double amount) {

        System.out.println("CreditCard payment of the amount : "+amount+"$");
    }

    @Override
    public boolean validateThePayment() {
        return true;
    }

    @Override
    public void collectPaymentDetails() {
        int cardNum = (int) (creditCard.getCardNUmber()/(Math.pow(10,4)));
        System.out.println("CreditCard number : "+cardNum+" ****");
    }
}
