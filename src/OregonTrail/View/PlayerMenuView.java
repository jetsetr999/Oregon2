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
public class PlayerMenuView {
    
    private String pMenu;
    
    public PlayerMenuView(){
        
        this.pMenu = "\n\t"
                   + "\n\t-----------------------------------------"
                   + "\n\t| Player Menu                        |"
                   + "\n\t-----------------------------------------"
                   + "        "
                   + "\n\t L - List of players and avatars "
                   + "\n\t D - Delete a player  "
                   + "\n\t P - Add a player "
                   + "\n\t C - Change player           "
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
            System.out.println("\n\t" + this.pMenu);
            
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
            case "L": // list players and avatars
                this.playerList();
                break;
            case "D": // delete a player
                this.playerDelete();
                break;
            case "P": // add a player
                this.playerAdd();
                break;
            case "C": // change a player
                this.playerChange();
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

    private void playerDelete() {
        System.out.println(" playerDelete stub ");
    }

    private void playerList() {
        System.out.println(" playerList stub ");
    }

    private void playerAdd() {
        System.out.println(" playerAdd stub ");
    }

    private void playerChange() {
        System.out.println(" playerChange stub ");
    }

    
}
