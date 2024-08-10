package structural.bridge;

public class Client {
    public static void main(String[] args) {

        MessageSender txt = new TextMessageSender();
        Message msg = new TextMessage(txt);
        msg.send();


        MessageSender email = new EmailMessageSender();
        Message msg1 = new EmailMessage(email);
        msg1.send();




    }
}
