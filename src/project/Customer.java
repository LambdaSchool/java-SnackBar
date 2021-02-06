package project;

public class Customer {

    // fields
    private static int maxId = 0;
    private int id;
    private String name;
    private double cashOnHand;

    // constructor
    public Customer(String name, double cashOnHand) {
        maxId++;
        id = maxId;
        this.name = name;
        this.cashOnHand = cashOnHand;
    }

    // setters and getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setname(String name) {
        this.name = name;
    }

    public void addCashOnHand(double extraCash) {
        cashOnHand += extraCash;
    }

    public String getCashOnHand() {
        String coh = String.valueOf(cashOnHand);
        String rtnCashOnHand = name + " cash on hand " + coh;
        return rtnCashOnHand;
    }

    public void buySnack(double totalCost) {
        cashOnHand = cashOnHand - totalCost;
        // Might want to think about a customer not having enough money for snacks
    }
}
