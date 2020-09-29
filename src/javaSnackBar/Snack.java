package javaSnackBar;

public class Snack 
{
    // fields
    private static int maxId = 0;
    private int id;
    private String name;
    private int quantity;
    private double cost;
    private int vendingMachineId;

    // constructor 
    public Snack(String name, double cost, int quantity, int vendingMachineId)
    {
        maxId++;
        id = maxId;

        this.name = name;
        this.cost = cost;
        this.quantity = quantity;
        this.vendingMachineId = vendingMachineId;
    }

    // methods 

    // getters
    public int getId()
    {
        return id;
    }

    public int getQuantity()
    {
        return quantity;
    }

    public String getName()
    {
        return name;
    }
    
    public double getCost()
    {
        return cost;
    }
    
    public int getVendingMachineId()
    {
        return vendingMachineId;
    }
    
    public double getTotalCostWithQuantity(int num)
    {
        return cost * num;
    }

    // setters
    public void setName(String name)
    {
        this.name = name;
    }
    
    public void setCost(double cost)
    {
        this.cost = cost; 
    }
    
    public void setVendingMachineId(int vendingMachineId)
    {
        this.vendingMachineId = vendingMachineId;
    }
    
    public void addQuantity(int addQuantity)
    {
        this.quantity += addQuantity;
    }
    
    public void buySnack(int buyQuantity)
    {
        this.quantity -= buyQuantity;
    }

}