/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OregonTrail_Enum;

/**
 *
 * @author Dad
 */
public enum InventoryEnum {
    
    Required("Required","Required Inventory",123,44,3),
    Quantity("Quantity", "Show on hand quantity", 25, 65,2),
    Weight("Weight", "Show total wieght on hand", 58,4, 3),
    Cost("Cost","Cost of inventory on hand",78,56,6);
    
    private String product;
    private String description;
    private double cost;
    private double weight;
    private double quantity;
    
    InventoryEnum(String product, String description, double cost, 
            double weight, double quantity){
            this.product = product;
            this.description = description;
            this.cost = cost;
            this.weight = weight;
            this.quantity = quantity;
            
    }

    @Override
    public String toString() {
        return "InventoryEnum{" + "product=" + product + ", description=" + description + ", cost=" + cost + ", weight=" + weight + ", quantity=" + quantity + '}';
    }
}