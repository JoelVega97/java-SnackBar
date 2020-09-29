package SnackBar;

public class Main {
    
    private static void workingData(){

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
    


    System.out.println(jane.getName() + " " +  "cash on hand " + jane.buySnacks(soda.getCost(), 3));
    System.out.println( "Quantity of" + " " + soda.getName() + " " + "is" + " " + soda.buySnack(3));

    System.out.println(jane.getName() + " " +  "cash on hand " + jane.buySnacks(pretz.getCost(), 1));
    System.out.println( "Quantity of" + " " + pretz.getName() + " " + "is" + " " + pretz.buySnack(1));

    System.out.println(bob.getName() + " " + "cash on hand" + " " + bob.buySnacks(soda.getCost(), 2));
    System.out.println("Quantity of" + " " + soda.getName() + " " + "is" + " " + soda.buySnack(2));

    System.out.println(jane.getName() + " " + "cash on hand" + " " + jane.addCash(10));

    System.out.println(jane.getName() + " " + "cash on hand" + " " + jane.buySnacks(choco.getCost(), 1));
    System.out.println("Quantity of" + " " + choco.getName() + " " + "is" + " " + choco.buySnack(1));

    System.out.println("Quantity of" + " " + pretz.getName() + " " + "is" + " " + pretz.addQuantity(12));

    System.out.println(bob.getName() + " " + "cash on hand" + " " + bob.buySnacks(pretz.getCost(), 3));
    System.out.println("Quantity of" + " " + pretz.getName() + " " + "is" + " " + pretz.buySnack(3));
    }

     public static void main(String[] args) {
        workingData();
    }
}