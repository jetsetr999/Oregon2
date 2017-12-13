/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OregonTrail.View;

import OregonTrail_Control.GameControl;
import java.util.Scanner;
import oregontraildp1.OregonTrailDP1;

/**
 *
 * @author Darrin
 */
class HelpMenuView {
    
    private String hMenu;
    
    public HelpMenuView(){
        
        this.hMenu = "\n\t"
                   + "\n\t-----------------------------------------"
                   + "\n\t| Help Menu                             |"
                   + "\n\t-----------------------------------------"
                   + "        "
                   + "\n\t G - What is the goal of the game?   "
                   + "\n\t M - How to move  "
                   + "\n\t R - Minimum required resources  "
                   + "\n\t B - Buying resources            "
                   + "\n\t E - Event actions              "
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
            System.out.println("\n\t" + this.hMenu);
            
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
            case "G": // game goal
                this.gameGoal();
                break;
            case "M": // how to move
                this.gameMove();
                break;
            case "R": // minimum resources
                this.minResources();
                break;
            case "B": // how and when to purchase resources
                this.buyResources();
                break;
            case "E":  // events to look for
                this.eventActions();
                break;
            default:
                System.out.println("\n\t *** invalid selection *** try again ");
                break;
        }
        return false;
    }

    private void gameGoal() {
        System.out.println("\n\t The goal of the game is to get from Ohio to Oregon");
    }

    private void gameMove() {
        System.out.println(" gameMove stub ");
    }

    private void minResources() {
        System.out.println(" minResources stub ");
    }

    private void buyResources() {
        System.out.println(" buyReources stub ");
    }

    private void eventActions() {
        System.out.println(" eventActions stub ");
    }

    private void returnMainMenu() {
        System.out.println(" returnMaainMenu stub ");
    }

}