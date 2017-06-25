package bridge;

public class MessageTest {
    public static void main(final String[] arguments) {
        Message message = new SystemMessage();
        message.Subject = "A Message";
        message.Body = "Hi there, Please accept this message.";
        
        MessageSender text = new TextSender();
        message.MessageSender = text;
        message.Send();
        
        MessageSender web = new WebServiceSender();
        message.MessageSender = web;
        message.Send();
    }
}