package service.filters;

import model.Applicant;

public class EligibilityFilter implements Filter {
    @Override
    public boolean apply(Applicant applicant) {
        if (applicant.getAge() >= 18 && applicant.getAge() <= 30) {
            System.out.println(applicant.getName() + " passed eligibility check.");
            return true;
        }
        System.out.println(applicant.getName() + " did not pass eligibility check.");
        return false;
    }
}
