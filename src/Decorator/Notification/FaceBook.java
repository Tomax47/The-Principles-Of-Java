package Decorator.Notification;

public class FaceBook extends NotifierBaseDec{
    protected final String faceBookAddress;

    public FaceBook(Notifier newNotifier, String faceBookAddress) {
        super(newNotifier);
        this.faceBookAddress = faceBookAddress;
    }

    public String getUsername() {
        return notifier.getUsername();
    }

    @Override
    public String sendMessage() {
        return notifier.sendMessage()+" | sent via FaceBook to "+faceBookAddress;
    }
}
