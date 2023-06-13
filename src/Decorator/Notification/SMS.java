package Decorator.Notification;

public class SMS extends NotifierBaseDec{
    protected final int phoneNumber;

    public SMS(Notifier newNotifier, int phoneNumberWithoutTheCountryCode) {
        super(newNotifier);
        this.phoneNumber = phoneNumberWithoutTheCountryCode;
    }

    public String getUsername() {
        return notifier.getUsername();
    }

    @Override
    public String sendMessage() {
        return notifier.sendMessage()+" | sent via SMS to the number "+phoneNumber;
    }
}
