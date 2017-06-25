package bridge;

/// The 'Bridge/Implementor' interface
public interface MessageSender {
    void SendMessage(String subject, String body);
}
