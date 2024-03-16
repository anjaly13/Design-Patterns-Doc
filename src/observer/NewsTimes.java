package observer;

import java.util.ArrayList;
import java.util.List;

public class NewsTimes {

    final NotificationService notificationService;

    public NewsTimes() {
        this.notificationService = new NotificationService();
    }

    public NotificationService getNotificationService(){
        return this.notificationService;
    }

    public void notifyUser(){
        this.notificationService.sendNotification();
    }

}

class Run{
    public static void main(String[] args) {
        NewsTimes newsTimes = new NewsTimes();
        newsTimes.getNotificationService().subscribe(new MobileListener("6898798","Hi"));
        newsTimes.notifyUser();
    }
}

class NotificationService{
    List<EventListeners> listeners =  new ArrayList<>();

    public void subscribe(EventListeners listener){
        listeners.add(listener);
    }
    public void remove(EventListeners listener){
        listeners.remove(listener);
    }

    public void sendNotification(){
        listeners.forEach( listener -> listener.send());
    }

}

interface EventListeners{
    void send();
}

class MobileListener implements EventListeners{
    String mobileNumber;
    String message;

    public MobileListener(String mobileNumber, String message) {
        this.mobileNumber = mobileNumber;
        this.message = message;
    }

    @Override
    public void send() {
        // send message notification
    }
}