package The_Strategy_Pattern;

public class CreditCard {
    private final int cardNUmber;
    private final int cvc;
    private final int dateOfExpiration;

    private double balance;

    public CreditCard(int cardNUmber, int cvc, int dateOfExpiration) {
        this.cardNUmber = cardNUmber;
        this.cvc = cvc;
        this.dateOfExpiration = dateOfExpiration;
    }

    public int getCardNUmber() {
        return cardNUmber;
    }

    public int getCvc() {
        return cvc;
    }

    public int getDateOfExpiration() {
        return dateOfExpiration;
    }


}
