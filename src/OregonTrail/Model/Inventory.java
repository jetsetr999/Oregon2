/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OregonTrail.Model;

import OregonTrail_Enum.InventoryItemEnum;
import java.io.Serializable;

/**
 *
 * @author Darrin
 *
 */
public class Inventory implements Serializable {

    private InventoryItemEnum itemType;
    private double itemQuantity;

    public Inventory() {

    }

    public Inventory(InventoryItemEnum inventoryItemType, double quantity) {
        itemType = inventoryItemType;
        itemQuantity = quantity;

    }

    public InventoryItemEnum getItemType() {
        return itemType;
    }

    public void setItemType(InventoryItemEnum itemType) {
        this.itemType = itemType;
    }

    public double getItemQuantity() {
        return itemQuantity;
    }

    public void setItemQuantity(double itemQuantity) {
        this.itemQuantity = itemQuantity;
    }

}
