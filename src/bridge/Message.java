package bridge;

/// The 'Abstraction' class
public abstract class Message {
    protected MessageSender messageSender;
    protected String subject;
    protected String body;
    public abstract void Send();
}
