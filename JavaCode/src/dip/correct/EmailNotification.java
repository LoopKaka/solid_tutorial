package dip.correct;

public class EmailNotification implements Notification {

    @Override
    public void sendNotification(String message) {
        System.out.println(message);
    }

}
