package bridge;

/// The 'RefinedAbstraction' class
public class SystemMessage extends Message {
    @Override
    public void Send(){
        messageSender.SendMessage(subject, body);
    }
}
