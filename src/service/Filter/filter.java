package service.filters;

import model.Applicant;

public interface Filter {
    boolean apply(Applicant applicant);
}
