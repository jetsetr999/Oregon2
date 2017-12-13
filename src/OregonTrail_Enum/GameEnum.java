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
public enum GameEnum {
    
    Map("Map","Map Display"),
    Time("Time", "Total Time Taken"),
    Actors("Avatars", "People in the game"),
    Supplies("Supplies","On hand supplies");
    
    private String option;
    private String description;
   
    
    GameEnum(String option, String description){
            this.option = option;
            this.description = description;
            
    }                

    @Override
    public String toString() {
        return "GameEnum{" + "option=" + option + ", description=" + description + '}';
    }
    }
