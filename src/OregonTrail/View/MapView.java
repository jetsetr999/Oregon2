/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OregonTrail.View;

import OregonTrail.Model.Map;
import OregonTrail_Control.MapControl;
import OregonTrail_Enum.MapEnum;
import java.util.Scanner;

/**
 *
 * @author Darrin
 */
public class MapView {

    private String mMenu;

    public MapView() {

        this.mMenu = "\n\t"
                + "\n\t-----------------------------------------"
                + "\n\t| Map Menu                        |"
                + "\n\t-----------------------------------------"
                + "        "
                + "\n\t L - List of map locations  "
                + "\n\t C - Current location  "
                + "\n\t D - Distance to next location  "
                + "\n\t F - Distance to final location        "
                + "\n\t H - Help menu              "
                + "\n\t Q - Return to previous menu     "
                + "\n\t ";
    }

    public void displayMenu() {
        boolean done = false;
        do {
            //prompt for and get players name
            String menuOption = this.getMenuOption();
            if (menuOption.toUpperCase().equals("Q")) // users quits
            {
                return; // exit game
            }
            // do the request action and display next view
            done = this.doAction(menuOption);
        } while (!done);

    }

    private String getMenuOption() {
        Scanner keyboard = new Scanner(System.in); // get infile
        String value = ""; // return value
        boolean valid = false; // not valid

        while (!valid) { // loop to get valid name
            System.out.println("\n\t" + this.mMenu);

            value = keyboard.nextLine();
            value = value.trim(); // trim off blanks

            if (value.length() < 1) { // value is blank
                System.out.println("\n Invalid entry: menu option can not be blank ");
                continue;
            }
            break; // end the loop
        }
        return value; // return the menu
    }

    private boolean doAction(String menuOption) {

        menuOption = menuOption.toUpperCase(); // convert to upper case

        switch (menuOption) {
            case "L": // list of map locations
                this.listLocations();
                break;
            case "C": // current location
                this.currentLocation();
                break;
            case "D": // distance to next location
                this.nextLocation();
                break;
            case "F": // distance to final location
                this.finalLocation();
                break;
            case "H": // Help menu  
                this.helpMenu();
                break;
            default:
                System.out.println("\n\t *** invalid selection *** try again ");
                break;
        }
        return false;
    }
    private void helpMenu() {
        
        // display help menu
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.displayMenu();
    }

    private void listLocations() {
        // display help menu
        MapControl map = new MapControl();
         //map.mapLocationList();
        System.out.println("list location stub");
    }

    private void nextLocation() {
        System.out.println("next location stub");
    }

    private void finalLocation() {
        System.out.println("final location stub");
    }

    private void currentLocation() {
        System.out.println("current location stub");
    }
}
/*public static MapEnum createMap() {

 MapEnum map = new MapEnum();
        
 ArrayList<Locations> locations = createLocations();
 map.setLocations(locations);
        
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


