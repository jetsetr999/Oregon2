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
public enum SceneEnum {
    Regular("Regular","normal",3),
    RiverCrossing("River","River crossing many choices", 4),
    Trail("Trail stop","pit stop to resupply or rest",3),
    Town("Town","Town stop to buy supplies and wagon game start", 7),
    Fort("Fort", "Fort rest and re-supply", 7),
    Hotel("Hotel", "No pizza here ", 3);
    
    private String place;
    private String description;
    private double delay;
    
    SceneEnum(String place, String description, double delay){
        this.place = place;
        this.description = description;
        this.delay = delay;
        
    }

    @Override
    public String toString() {
        return "SceneEnum{" + "place=" + place + ", description=" + description + ", delay=" + delay + '}';
    }
    
}
