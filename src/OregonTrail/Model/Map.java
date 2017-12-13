/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OregonTrail.Model;

import OregonTrail_Enum.MapEnum;
import java.io.Serializable;


/**
 *
 * @author Darrin
 */
public class Map implements Serializable {

    private Enum place;

    public double getLocations() {
        return locations;
    }

    public void setLocations(double locations) {
        this.locations = locations;
    }
    private double locations;

   
    public Map(MapEnum mapPlace, double location) {
        place = mapPlace;
        locations = location;

    }

    public Enum getPlace() {
        return place;
    }

    public void setPlace(Enum place) {
        this.place = place;
    }

    
   
   
    /*MapEnum map = new MapEnum();

     /*ArrayList<Locations> locations = createLocations();
     map.setLocations(locations);*/

    /*scenes = createScenes()
     questions = createQuestions()
        
     assignQuestionsToScenes()
     assignItemsToScenes()
     return map;
     }

     public static ArrayList<Locations> createLocations() {

     ArrayList<Locations> locationList = new ArrayList<>();

     locationList.add(Locations.Independence);

     locationList.add(Locations.KansasRiver);
     locationList.add(Locations.FortKearney);
     locationList.add(Locations.ChimneyRock);
     locationList.add(Locations.FortLaramie);
     locationList.add(Locations.IndependenceRock);
     locationList.add(Locations.SouthPass);
     /*GreenRiver("Green River", "River", 1050)     
     SodaSprings("Soda Springs", "Landmark", 1200)     
     FortHall("Fort Hall", "Fort", 1350)     
     SnakeRiver("Snake River", "River", 1500)     
     FortBoise("Fort Boise", "Fort", 1650)     
     BlueMountains("Blue Mountains", "Landmark", 1800)     
     FortWallaWalla("Fort Walla Walla", "Fort", 2000)     
     TheDalles("TheDalles", "Landmark", 2250)
     OregonCity("Oregon City", "Town", 2500)
         
        
     return locationList;
     }*/

    

    

    

    

    

    
}

