package Decorator.Notification;

public abstract class NotifierBaseDec implements Notifier{
    protected Notifier notifier;

    public NotifierBaseDec(Notifier newNotifier) {
        this.notifier = newNotifier;
    }

    @Override
    public String getUsername() {
        return "Sent to "+notifier.getUsername();
    }

    @Override
    public String sendMessage() {
        return notifier.sendMessage()+"";
    }
}
