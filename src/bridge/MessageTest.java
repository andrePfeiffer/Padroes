package bridge;

public class MessageTest {
    public static void main(final String[] arguments) {
        Message message = new SystemMessage();
        message.subject = "A Message";
        message.body = "Hi there, Please accept this message.";
        
        MessageSender text = new TextSender();
        message.messageSender = text;
        message.Send();
        
        MessageSender web = new WebServiceSender();
        message.messageSender = web;
        message.Send();
    }
}