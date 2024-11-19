package service.observer;

public class HostelManagementObserver implements Observer {
    @Override
    public void update(String message) {
        System.out.println("Hostel Management received update: " + message);
    }
}
