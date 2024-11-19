package controller;

import model.Applicant;
import service.Pipe;
import service.filters.EligibilityFilter;
import service.filters.PaymentFilter;
import service.filters.ServiceAvailabilityFilter;
import service.observer.ApplicantStatusObserver;
import service.observer.HostelManagementObserver;

public class HostelSystem {
    public static void main(String[] args) {
        // Applicant Information
        Applicant applicant = new Applicant("John Doe", 25, 5000.0, true, true);

        // Create Pipe and Add Filters
        Pipe pipe = new Pipe();
        pipe.addFilter(new EligibilityFilter());
        pipe.addFilter(new PaymentFilter());
        pipe.addFilter(new ServiceAvailabilityFilter());

        // Add Observers
        pipe.addObserver(new HostelManagementObserver());
        pipe.addObserver(new ApplicantStatusObserver());

        // Process Applicant Through Pipe
        if (pipe.process(applicant)) {
            System.out.println(applicant.getName() + " has been successfully approved for the hostel.");
        } else {
            System.out.println(applicant.getName() + " was not approved for the hostel.");
        }
    }
}
