package Decorator.Notification;

public class NotifierBase implements Notifier{
    protected final String username;
    protected String message;

    public NotifierBase(String username, String message) {
        this.username = username;
        this.message = message;
    }

    @Override
    public String getUsername() {
        return username;
    }

    @Override
    public String sendMessage() {
        return "Message : "+message;
    }
}
