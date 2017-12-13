/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OregonTrail.View;

import Exceptions.SupplyControlException;
import java.util.Scanner;

/**
 *
 * @author Darrin
 */
class GameMenuView {

    private String gMenu;
    
    public GameMenuView(){
        
        this.gMenu = "\n\t"
                   + "\n\t-----------------------------------------"
                   + "\n\t| Game Menu                             |"
                   + "\n\t-----------------------------------------"
                   + "        "
                   + "\n\t V - Map view  "
                   + "\n\t C - Choose an avatar "
                   + "\n\t O - Resources on hand  "
                   + "\n\t S - Purchase supplies  "
                   + "\n\t P - Player menu  "
                   + "\n\t R - Stop and rest            "
                   + "\n\t I - Inventory menu "
                   + "\n\t H - Help menu              "
                   + "\n\t Q - Return to main menu     "
                   + "\n\t ";
    }
    
    public void displayMenu() throws SupplyControlException {
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
        
        while(!valid){ // loop to get valid name
            System.out.println("\n\t" + this.gMenu);
            
            value = keyboard.nextLine(); 
            value = value.trim(); // trim off blanks
            
            if(value.length() < 1){ // value is blank
                System.out.println("\n Invalid entry: menu option can not be blank ");
                continue;
            }
            break; // end the loop
        }
        return value; // return the menu
    }

    private boolean doAction(String menuOption) throws SupplyControlException {
        
        menuOption = menuOption.toUpperCase(); // convert to upper case
        
        switch(menuOption){
            case "V": // Map view
                this.mapView();
                break;
            case "C": // choose an avatar
                this.actorChoice();
                break;
            case "O": // resources on hand
                this.resourcesOnHand();
                break;
            case "S": // purchase supplies
                this.supplyPurchase();
            case "P": // Player list
                this.playerMenu();
                break;
            case "R": // Stop and rest
                this.stopView();
                break;
            case "I": // Inventory menu
                this.inventoryMenu();
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

    private void mapView() {
        // purchase supplies
        MapView map = new MapView();
        map.displayMenu();
    }

    private void resourcesOnHand() {
        System.out.println(" resourceOnHand stub");
    }

    private void playerMenu() {
        // display help menu
        PlayerMenuView playerMenu = new PlayerMenuView();
        playerMenu.displayMenu();
    }

    private void stopView() {
        System.out.println(" stopView stub"); 
    }

    private void helpMenu() {
        // display help menu
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.displayMenu();
    }

    private void inventoryMenu() {
        // display help menu
        InventoryMenuView inventoryMenu = new InventoryMenuView();
        inventoryMenu.displayMenu();
    }

    private void actorChoice() {
        // choose an avatar
        ActorView avatarMenu = new ActorView();
        avatarMenu.displayMenu();
    }

    private void supplyPurchase() throws SupplyControlException {
        // purchase supplies
        SupplyView supplyPurchase = new SupplyView();
        supplyPurchase.displayMenu();
    }

     
        
}
