/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OregonTrail_Enum;

/**
 *
 * @author Darrin
 */
public enum SupplyEnum {
    
    Buy("Buy","Buy supplies",123,44),
    Sell("Sell", "Sell supplies", 25, 65),
    Show("Show", "Show inventory", 58,4),
    Save("Save","Save inventory",78,56);
    
    private String transaction;
    private String description;
    private double cost;
    private double weight;
    //private double quantity;
    
    SupplyEnum(String transaction, String description, double cost, 
            double weight){
            this.transaction = transaction;
            this.description = description;
            this.cost = cost;
            this.weight = weight;
            
            
    }

    @Override
    public String toString() {
        return "SupplyEnum{" + "transaction=" + transaction + ", description=" 
                             + description + ", cost=" + cost + ", weight=" 
                             + weight + '}';
    }
}
