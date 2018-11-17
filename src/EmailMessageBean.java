import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class EmailMessageBean {

    private SimpleStringProperty sender;
    private SimpleStringProperty subject;
    private SimpleIntegerProperty size;

    public EmailMessageBean(String subject, String sender, int size) {
        this.subject = new SimpleStringProperty(subject);
        this.sender = new SimpleStringProperty(sender);
        this.size = new SimpleIntegerProperty(size);
    }

    public String getSender(){
        return sender.get();
    }
    public String getSubject(){
        return  subject.get();
    }
    public int getSize(){
        return size.get();
    }


}


