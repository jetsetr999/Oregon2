/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OregonTrail.View;

import Exceptions.SupplyControlException;
import OregonTrail.Model.Player;
import OregonTrail_Control.GameControl;
import OregonTrail_Control.SupplyControl;
import java.util.Scanner;
import oregontraildp1.OregonTrailDP1;

/**
 *
 * @author Darrin
 */
public class SupplyView {

    private String sMenu;

    public SupplyView() {

        this.sMenu = "\n\t"
                + "\n\t-----------------------------------------"
                + "\n\t| Supplies Menu                         |"
                + "\n\t-----------------------------------------"
                + "        "
                + "\n\t O - Supplies on hand   "
                + "\n\t W - Total weight on hand  "
                + "\n\t P - Purchase Supplies  "
                + "\n\t M - Maximum weight allowed          "
                + "\n\t A - Maximum anmials allowed         "
                + "\n\t Q - Return to previous menu     "
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

        while (!valid) { // loop to get valid name
            System.out.println("\n\t" + this.sMenu);

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

    private boolean doAction(String menuOption) throws SupplyControlException {

        menuOption = menuOption.toUpperCase(); // convert to upper case

        switch (menuOption) {
            case "O": // supplies on hand
                this.suppliesOnHand();
                break;
            case "W": // total wieght on hand
                this.totalWeight();
                break;
            case "P": // purchase supplies
                this.purchaseSupplies();
                break;
            case "M": // maximum weight allowed
                this.maxWeight();
                break;
            case "A":  // maximum animals allowed
                this.maxAnimals();
                break;
            default:
                System.out.println("\n\t *** invalid selection *** try again ");
                break;
        }
        return false;
    }

    private void suppliesOnHand() {
        System.out.println(" suppliesOnHand stub");
    }

    private void totalWeight() throws SupplyControlException {
        double totalWeight = SupplyControl.calcWeight(OregonTrailDP1.getCurrentGame().getItems());
        System.out.println("Total weight " + totalWeight);
    }
        
              
    
    private void purchaseSupplies() {
        System.out.println(" pruchaseSupplies stub");
    }

    private void maxWeight() {
        System.out.println(" maxWeight stub");
    }

    private void maxAnimals() {
        System.out.println(" maxAnimals stub");
    }

    
}
