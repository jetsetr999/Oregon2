/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OregonTrail_Control;

/**
 *
 * @author Darrin
 */
public class InventoryControl {

    public static double calcQuantity(double onHand, double items){
                
        if (onHand < 0 || items < 0 || onHand > 300 || items > 300){
            return -1;
        }

        double totalOnHand = onHand * items;
        //double totalWeight = totalOnHand * weight;
        return totalOnHand;
        
    }

   public static double calcWeight(double onHand, double weight){//, double weight, double cost) {
                
        if (onHand < 0 || weight < 0 || onHand > 300 || weight > 300){//|| weight < 0 || cost < 0) {
            return -1;
        }

        double totalWeight = onHand * weight;
        //double totalWeight = totalOnHand * weight;
        return totalWeight;
        
    }
    
}
