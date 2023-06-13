package Decorator.Notification;

/**
 To implement the Decorator pattern we will need to create :
    1- Interface class having the base methods
    2- Base class implementing the interface
    3- Decorator class implementing the interface and functionalizing the methods
    4- The rest of the classes
    5- Main class for testing
 */
public class Main {
    public static void main(String[] args) {

        Notifier notification = new Email(new FaceBook(new NotifierBase("Lucas227","Food delivery notification"),
                "FaceBook.com/LucasM227"),"LucasMoore@Gmail.com");

        Notifier notification2 = new SMS(new WhatsApp(new NotifierBase("Alex","Amazon discount offers!"),99204678),99204678);

        System.out.println("Notification's details : \n"+notification.sendMessage()+
                "\nReceiver's username : "+notification.getUsername());

        System.out.println("\nNotification's details : \n"+notification2.sendMessage()+
                "\nReceiver's username : "+notification2.getUsername());

    }
}
