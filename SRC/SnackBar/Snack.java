package SnackBar;

public class Snack {
    //fields (knows)
    private static int maxId = 0;

    private int id;
    private String name;
    private int quantity;
    private double cost;
    private int vmID;

    public Snack(String name, int quantity, double cost, int vmID){
        maxId++;
        id = maxId;

        this.name = name;
        this.quantity = quantity;
        this.cost = cost;
        this.vmID = vmID;
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
    
    public int getVmID(){
        return vmID;
    }
    public void setVmID(int vmID){
        this.vmID = vmID;
    }
}
