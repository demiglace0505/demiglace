
import java.util.ArrayList;


public class Main {

    public static void main(String[] args) {
            
        MessagingService messageList = new MessagingService();
        
        Message message1 = new Message("ichika" , "1");
        Message message2 = new Message("nino" , "2");
        Message message3 = new Message("miku" , "3");
        
        messageList.add(message1);
        messageList.add(message2);
        messageList.add(message3);
        
        System.out.println(messageList.getMessages());
        
    }
}
