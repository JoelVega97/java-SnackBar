package SnackBar;

public class Snack {
    //fields (knows)
    private static int maxId = 0;

    private int id;
    private String name;
    private int quantity;
    private double cost;
    private int vendingID;

    public Snack(String name, int quantity, double cost, int vendingID){
        maxId++;
        id = maxId;

        this.name = name;
        this.quantity = quantity;
        this.cost = cost;
        this.vendingID = vendingID;
    }
    //sets & gets

    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public int getQuantity(){
        return quantity;
    }
    public void setQuantity(int quantity){
        this.quantity = quantity;
    }

    public double getCost(){
        return cost;
    }
    public void setCost(double cost){
        this.cost = cost;
    }
    
    public int getVendingID(){
        return vendingID;
    }
    public void setVendingID(int vendingID){
        this.vendingID = vendingID;
    }
}
