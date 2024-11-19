package model;

public class Applicant {
    private String name;
    private int age;
    private double paymentAmount;
    private boolean hasMadePayment;
    private boolean requiresAC;

    public Applicant(String name, int age, double paymentAmount, boolean hasMadePayment, boolean requiresAC) {
        this.name = name;
        this.age = age;
        this.paymentAmount = paymentAmount;
        this.hasMadePayment = hasMadePayment;
        this.requiresAC = requiresAC;
    }

    public String getName() { return name; }
    public int getAge() { return age; }
    public double getPaymentAmount() { return paymentAmount; }
    public boolean hasMadePayment() { return hasMadePayment; }
    public boolean requiresAC() { return requiresAC; }
}
