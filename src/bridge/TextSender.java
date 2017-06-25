package bridge;

/// The 'ConcreteImplementor' class
public class TextSender implements MessageSender {
    @Override
    public void SendMessage(String subject, String body){
        String messageType = "Text";
        System.out.println(messageType);
        System.out.println("--------------");
        System.out.println("Subject:  " + subject + " from " + messageType + "\nBody:  " + body + "\n");
    }
}
