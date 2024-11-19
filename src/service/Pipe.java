package service;

import model.Applicant;
import service.filters.Filter;
import service.observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class Pipe {
    private List<Filter> filters = new ArrayList<>();
    private List<Observer> observers = new ArrayList<>();

    public void addFilter(Filter filter) {
        filters.add(filter);
    }

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public boolean process(Applicant applicant) {
        for (Filter filter : filters) {
            if (!filter.apply(applicant)) {
                notifyObservers(applicant.getName() + " was rejected.");
                return false;
            }
        }
        notifyObservers(applicant.getName() + " has been approved.");
        return true;
    }

    private void notifyObservers(String message) {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }
}
