/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OregonTrail.View;

import java.util.Scanner;

/**
 *
 * @author Darrin
 */
public class InventoryMenuView {
    private String iMenu;
    
    public InventoryMenuView(){
        
        this.iMenu = "\n\t"
                   + "\n\t-----------------------------------------"
                   + "\n\t| Inventory Menu                        |"
                   + "\n\t-----------------------------------------"
                   + "        "
                   + "\n\t L - List of inventory  "
                   + "\n\t O - Inventory on hand  "
                   + "\n\t W - Weight calculation  "
                   + "\n\t C - Cost subtotal            "
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
        
        while(!valid){ // loop to get valid name
            System.out.println("\n\t" + this.iMenu);
            
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

    private boolean doAction(String menuOption) {
        
        menuOption = menuOption.toUpperCase(); // convert to upper case
        
        switch(menuOption){
            case "L": // list of inventory
                this.listInventory();
                break;
            case "O": // resources on hand
                this.resourcesOnHand();
                break;
            case "W": // weight calculation
                this.calcWeight();
                break;
            case "C": // Cost of supplies
                this.calcSupplies();
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

    private void resourcesOnHand() {
        System.out.println(" resourceOnHand stub");
    }

    private void helpMenu() {
        
        // display help menu
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.displayMenu();
    }

    private void calcSupplies() {
        System.out.println(" calcSupplies stub");
    }

    private void calcWeight() {
        System.out.println(" calcWeight stub");
    }

    private void listInventory() {
       System.out.println(" listInventory stub");
    }
}
