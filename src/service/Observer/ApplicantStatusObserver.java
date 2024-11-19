package service.observer;

public class ApplicantStatusObserver implements Observer {
    @Override
    public void update(String message) {
        System.out.println("Applicant received update: " + message);
    }
}
