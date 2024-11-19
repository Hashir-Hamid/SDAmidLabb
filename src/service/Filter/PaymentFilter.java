package service.filters;

import model.Applicant;

public class PaymentFilter implements Filter {
    @Override
    public boolean apply(Applicant applicant) {
        double requiredAmount = 5000.0;
        if (applicant.hasMadePayment() && applicant.getPaymentAmount() >= requiredAmount) {
            System.out.println(applicant.getName() + " has made the required payment.");
            return true;
        }
        System.out.println(applicant.getName() + " has not made the required payment.");
        return false;
    }
}
