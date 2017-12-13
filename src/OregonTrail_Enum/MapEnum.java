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
public enum MapEnum {
    
    Hotel("Hotel","scary",1),
    River("River","river crossing",2),
    Town("Town","god town",4),
    TrailStop("Trail stop","Stop on trail for rest and food",5),
    Fort("Fort","Resupply and rest",3),
    Resource("Resource","stop for food, repairs or rest",2),
    FortKearney("FortKearney", "first stop for supplies", 300),
    ChimneyRock("ChimneyRock", "resting and re-supply", 450),
    FortLaramie("FortLaramie"," fort rest and re-supply", 600),
    IndependenceRock("IndependenceRock","Fort chance tor rest and buy supplies", 750),
    SouthPass("SouthPass", "rest", 900),
    GreenRiver("Green River", "River", 1050),     
    SodaSprings("Soda Springs", "Landmark", 1200),     
    FortHall("Fort Hall", "Fort", 1350),     
    SnakeRiver("Snake River", "River", 1500),     
    FortBoise("Fort Boise", "Fort", 1650),     
    BlueMountains("Blue Mountains", "Landmark", 1800),     
    FortWallaWalla("Fort Walla Walla", "Fort", 2000),     
    TheDalles("TheDalles", "Landmark", 2250),
    OregonCity("Oregon City", "Town", 2500);
    
    private String place;
    private String description;
    private double location;
    
    MapEnum(String place, String description, double location){
        this.place = place;
        this.description = description;
        this.location = location;
        
    }

    @Override
    public String toString() {
        return "MapEnum{" + "place=" + place + ", description=" + description 
                          + ", delay=" + location + '}';
    }
}
