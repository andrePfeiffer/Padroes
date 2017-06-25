package bridge;

/// The 'Abstraction' class
public abstract class Message {
    protected MessageSender MessageSender;
    protected String Subject;
    protected String Body;
    public abstract void Send();
}
