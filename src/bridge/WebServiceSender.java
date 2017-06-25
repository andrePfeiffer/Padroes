package bridge;

/// The 'ConcreteImplementor' class
public class WebServiceSender implements MessageSender {
    @Override
    public void SendMessage(String subject, String body) {
        String messageType = "Web Service";
        System.out.println(messageType);
        System.out.println("--------------");
        System.out.println("Subject:  " + subject + " from " + messageType + "\nBody:  " + body + "\n");
    }
}
