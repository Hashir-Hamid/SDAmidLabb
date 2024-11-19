package service.filters;

import model.Applicant;

public class ServiceAvailabilityFilter implements Filter {
    @Override
    public boolean apply(Applicant applicant) {
        if (applicant.requiresAC()) {
            System.out.println(applicant.getName() + " requires AC room, checking availability...");
            System.out.println("AC room is available for " + applicant.getName());
            return true;
        }
        System.out.println(applicant.getName() + " does not require AC room or it is available.");
        return true;
    }
}
