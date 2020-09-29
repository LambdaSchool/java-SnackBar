package javaSnackBar;

public class Customer 
{
    //fields 
    private static int maxId = 0;
    private int id;
    private String name;
    private double cashOnHand;

    //constructor 
    public Customer(String name, double cashOnHand)
    {
        maxId++;
        id = maxId;

        this.name = name;
        this.cashOnHand = cashOnHand;
    }

    //methods
    //getters
    public int getId()
    {
        return id;
    }

    public String getName()
    {
        return name;
    }

    public double getCashOnHand()
    {
        return cashOnHand;
    }

    //setters
    public void setName(String name)
    {
        this.name = name;
    }

    public void addCash(double cash)
    {
        this.cashOnHand += cash;
    }

    public void buySnacks(double costOfSnacks)
    {
        this.cashOnHand = this.cashOnHand - costOfSnacks;
    }
}