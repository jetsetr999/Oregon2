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
public enum ActorEnum {

    Banker("Banker", "He is in charge of money distribution", 1800),
    StoreKeeper("StoreKeeper", "He will help with supplies.", 1200),
    Carpenter("Carpenter", "He has a chance of repairing a wagon.", 800),
    Doctor("Doctor", "He has a higher chance of healing members of the party.", 1800),
    Farmer("Farmer", "Higher chance of finding and gathering food.", 1000);

    private String avatar;
    private String description;
    private double money;

    ActorEnum(String name, String description, double money) {
        this.avatar = name;
        this.description = description;
        this.money = money;

    }

    @Override
    public String toString() {
        return "ActorEnum{" + "name = " + avatar + ", description = " + description 
                            + ", money = " + money + '}';
    }

    public String getDescription() {
        return description;
    }

    public double getCoordinates() {
        return money;
    }
}
