package rbd.project;

public class VipCustomer {
    private String name;
    private double creditLimit;
    private String email;


    public VipCustomer() {
        this.name = "Default name";
        this.creditLimit = 0;
        this.email = "Default email";
    }

    public VipCustomer(String name, double creditLimit) {
        this(name, creditLimit, "Unknown");
    }


    public VipCustomer(String name, double creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }
}
