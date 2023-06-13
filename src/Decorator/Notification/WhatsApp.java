package Decorator.Notification;

public class WhatsApp extends NotifierBaseDec {

    protected final int phoneNumber;

    public WhatsApp(Notifier newNotifier, int phoneNumberWithoutTheCountryCode) {
        super(newNotifier);
        this.phoneNumber = phoneNumberWithoutTheCountryCode;
    }

    public String getUsername() {
        return notifier.getUsername();
    }

    @Override
    public String sendMessage() {
        return notifier.sendMessage()+" | Sent by WhatsApp to the the number "+phoneNumber;
    }
}
