package Decorator.Notification;

public class Email extends NotifierBaseDec{
    protected final String email;

    public Email(Notifier newNotifier, String email) {
        super(newNotifier);
        this.email = email;
    }

    public String getUsername() {
        return notifier.getUsername();
    }

    @Override
    public String sendMessage() {
        return notifier.sendMessage()+" | sent by Email to "+email;
    }
}
