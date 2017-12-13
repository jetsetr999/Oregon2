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
public enum InventoryItemEnum {

    Wheel("Wheel", "Wagon wheel", 30, 40),
    Gun("Gun", "Help with defense and hunting for food", 100, 10),
    Rope("Rope", "Rope for multiple uses", 5, 1),
    Wheat("Wheat", "barrel of wheat", 50, 75),
    Pots("Pots", "Pots and pans for cooking", 40, 10),
    Clothing("Clothing", "pants and shirt socks and underwear", 20, 5),
    Boots("Boots", "extra pair of boots", 20, 2),
    Bullets("Bullets", "Bullets for gun", 10, 4),
    Plates("Plates", "Plates for eating on with utensils", 8, 4),
    Wagon("Wagon", "Wagon for hauling all the stuff", 200, 400),
    Cart("Cart", "Hand cart much lighter than wagon and hold less", 40, 100),
    Jerky("jerky", "protein for the journey", 5, 1),
    Chicken("Chicken", "Chicken comes in a cage", 10, 4),
    Horse("Horse", "Requires a lot of food and care", 75, 1),
    Cow("Cow", "provides milk and  could help with some hauling", 100, 1),
    Oxen("Oxen", "provides muscle for hauling large amounts of weight", 200, 1),
    Axle("Axle", "Spare axle for wagon or cart", 20, 40),
    Ax("Ax", "Chopping wood for fire", 10, 10),
    Kit("Kit", "Repair kit for wagon or cart", 32, 20),
    Water("Water","Water barrell for holding several gallons of water",43,150),
    Honey("Honey","Natural sugar needed for energy ", 10,40),
    Salt("Salt","Salt needed for for retaining water", 15,50),
    Oil("Oil","Oil needed for lamps",40,23);
    

    private String item;
    private String description;
    private double cost;
    private double weight;
    

    InventoryItemEnum(String item, String description, double cost,
            double weight) {
        this.item = item;
        this.description = description;
        this.cost = cost;
        this.weight = weight;
        

    }

    public String getDescription() {
        return description;
    }

    public double getCost() {
        return cost;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "InventoryItemEnum{" + "item = " + item + ", description = " 
                + description + ", cost = " + cost + ", weight = " + weight + '}';
    }
}
