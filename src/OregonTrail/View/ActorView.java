/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OregonTrail.View;

import OregonTrail.Model.Player;
import OregonTrail_Control.GameControl;
import java.util.Scanner;

/**
 *
 * @author Darrin
 */
public class ActorView {

    private String aMenu;
    private String promptMessage;

    public ActorView() {

        this.aMenu = "\n\t"
                + "\n\t-----------------------------------------"
                + "\n\t| Actor Menu                        |"
                + "\n\t-----------------------------------------"
                + "        "
                + "\n\t L - List of avatar choices  "
                + "\n\t S - Select avatar  "
                + "\n\t D - Avatar description and abilities  "
                + "\n\t P - List players and avatar  "
                + "\n\t C - Avatar traits            "
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
            System.out.println("\n\t" + this.aMenu);

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
            case "L": // list avatar choices
                this.actorChoice();
                break;
            case "S": // select avatar/actor
                this.actorSelect();
                break;
            case "D": // Avatar description and abilities
                this.actorDescription();
                break;
            case "P": // Player list and avatars
                this.playerList();
                break;
            case "C": // Avatar traits
                this.actorTraits();
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

    private void actorChoice() {
        System.out.println(" actorChoice stub ");
    }

    private void actorDescription() {
        System.out.println(" actorDescription stub ");
    }

    private void playerList() {
        System.out.println(" playerList stub ");
    }

    private void actorTraits() {
        System.out.println(" actorTraits stub ");
    }

    private void actorSelect() {
       System.out.println("actorSelect stub");
    }

}
