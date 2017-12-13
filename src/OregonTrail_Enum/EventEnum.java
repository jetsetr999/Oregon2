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
public enum EventEnum {
    
    Attack("Attack","Attacked by Indians",123,44,3),
    Theft("Theft", "Supplies stolen", 25, 65,2),
    Health("Health", "Sickness or miracle health event", 58,4, 3),
    Weather("Weather","Storm or flood weather event",78,56,6);
    
    private String ordeal;
    private String description;
    private double quantity;
    private double weight;
    private double delay;
    
    EventEnum(String ordeal, String description, double quantity, 
            double weight, double delay){
            this.ordeal = ordeal;
            this.description = description;
            this.quantity = quantity;
            this.weight = weight;
            this.delay = delay;
            
    }

    @Override
    public String toString() {
        return "EventEnum{" + "ordeal=" + ordeal + ", description=" + description + ", quantity=" + quantity + ", weight=" + weight + ", delay=" + delay + '}';
    }
}
