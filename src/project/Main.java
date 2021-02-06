package project;

public class Main {
    private static void snackBar() {
        System.out.println("Welcome to Dylan's Snack bar");
        // Creating 2 instances of the customer class per readme
        Customer jane = new Customer("Jane", 45.25);
        Customer bob = new Customer("Bob", 33.14);

        // creating 3 instances of the vending machine class per readme
        VendingMachine food = new VendingMachine("Food");
        VendingMachine drink = new VendingMachine("Drink");
        VendingMachine office = new VendingMachine("Office");

        // creating 5 instances of snacls class per readme
        Snack chips = new Snack("Chips", 36, 1.75, food.getId());
        Snack chocolateBar = new Snack("Chocolate Bar", 36, 1.00, food.getId());
        Snack pretzel = new Snack("Pretzel", 30, 2.00, food.getId());
        Snack soda = new Snack("Soda", 24, 2.50, drink.getId());
        Snack water = new Snack("Water", 20, 2.75, drink.getId());


        jane.buySnack(soda.totalCostGivenQuantity(3));
        System.out.println(soda.totalCostGivenQuantity(3));
        soda.buySnack(3);
        System.out.println(jane.getCashOnHand());
        System.out.println(soda.getQuantity());

        jane.buySnack(pretzel.totalCostGivenQuantity(1));
        pretzel.buySnack(1);
        System.out.println(jane.getCashOnHand());
        System.out.println(pretzel.getQuantity());

        bob.buySnack(soda.totalCostGivenQuantity(2));
        soda.buySnack(2);
        System.out.println(bob.getCashOnHand());
        System.out.println(soda.getQuantity());

        jane.addCashOnHand(10.00);
        System.out.println(jane.getCashOnHand());

        jane.buySnack(chocolateBar.totalCostGivenQuantity(1));
        chocolateBar.buySnack(1);
        System.out.println(jane.getCashOnHand());
        System.out.println(chocolateBar.getQuantity());

        pretzel.addQuantity(12);
        System.out.println(pretzel.getQuantity());

        bob.buySnack(pretzel.totalCostGivenQuantity(3));
        pretzel.buySnack(3);
        System.out.println(bob.getCashOnHand());
        System.out.println(pretzel.getQuantity());



    }

    public static void main(String[] arg) {
        // all this method does is call somthing else
        snackBar();
    }
}