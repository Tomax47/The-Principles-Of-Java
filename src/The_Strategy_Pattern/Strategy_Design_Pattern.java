package The_Strategy_Pattern;

/**
 *
 The Strategy Design Pattern : It's a behavioural design pattern that defines a family of algorithms,
 puts each of them in a separate class, and makes their objects interchangeable..

 Strategies are independent, which means they are unaware of each other!

 The strategy pattern makes the main class that handle the processes has no visibility, which means
 that u can't know how the processes are being conducted cuz its using other classes, like payment processes fe.
 */

public class Strategy_Design_Pattern {

    public static void main(String[] args) {

        PerformPayment payment = new PerformPayment(new PaymentByCreditCard(new CreditCard(21458729, 232,24)),225.21,false);
        PerformPayment paymentByPayPal = new PerformPayment(new PaymentByPayPal("Example22@mail.com","223lk/87fasf"),125.00,true);

        payment.processOrder();
        System.out.println();
        paymentByPayPal.processOrder();
    }
}
