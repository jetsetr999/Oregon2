/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OregonTrail_Control;

import Exceptions.SupplyControlException;
import OregonTrail.Model.Inventory;
import java.util.ArrayList;

/**
 *
 * @author Darrin
 */
public class SupplyControl {

    public static double calcWeight(ArrayList<Inventory> items) 
            throws SupplyControlException {
        if( items == null){
        throw new SupplyControlException("Can not be blank try again");
       
        }

        double totalWeight = 0;

        totalWeight = items.stream().map((item) -> item.getItemQuantity()
                *item.getItemType().getWeight()).reduce(totalWeight, 
                (accumulator, _item) -> accumulator + _item);     
        return totalWeight;

    }

    

}
