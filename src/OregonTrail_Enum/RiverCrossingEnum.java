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
public enum RiverCrossingEnum {
    
    Swim("Swim", "Swimming across without supplies",.25,.5),
    Raft("Raft", "Build a raft with scrap and supplies", .40,1),
    Hire("Hire", "Hire a boat to take you and your crew across",.90,1),
    Search("Search", "Search for low spot to cross",.60,2);
    
    private String choice;
    private String description;
    private double chance;
    private double delay;
    
    RiverCrossingEnum(String choice, String description, double chance, double delay){
        this.choice = choice;
        this.description = description;
        this.chance = chance;
        this.delay = delay;
    }

    @Override
    public String toString() {
        return "RiverCrossingEnum{" + "choice=" + choice + ", description=" + description + ", chance=" + chance + ", delay=" + delay + '}';
    }
    
}
