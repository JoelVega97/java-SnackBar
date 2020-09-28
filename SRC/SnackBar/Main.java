package SnackBar;

public class Main {
    
    public static void main(String[] args) {
        System.out.println("hello everybody");
    }
    //VM
    VendingMachine VMF = new VendingMachine("Food");
    VendingMachine VMD = new VendingMachine("Drink");
    VendingMachine VMO = new VendingMachine("Office");
    //Snacks
    Snack chips = new Snack("Chips", 36, 1.75, VMF.getId());
    Snack choco = new Snack("Chocolate Bar", 36, 1.00, VMF.getId());
    Snack pretz = new Snack("Pretzel", 30, 2.00, VMF.getId());

    Snack soda = new Snack("Soda", 24, 2.50, VMD.getId());
    Snack water = new Snack("Water", 20, 2.75, VMD.getId());

    //Customers

    Customer bob = new Customer("Bob", 33.14);
    Customer jane = new Customer("Jane", 45.25);
}