/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OregonTrail.View;

import Exceptions.SupplyControlException;
import OregonTrail_Control.GameControl;
import java.util.Scanner;
import oregontraildp1.OregonTrailDP1;

/**
 *
 * @author Darrin
 */
public class MainMenuView {

    private String menu;

    public MainMenuView() {

        this.menu = "\n\t"
                + "\n\t ----------------------------------------------"
                + "\n\t | Main Menu                                  |"
                + "\n\t ----------------------------------------------"
                + "\n\t "
                + "\n\t N - Start new game"
                + "\n\t G - Get and start saved game"
                + "\n\t H - Get help on how to play the game"
                + "\n\t S - Save game"
                + "\n\t Q - Quit game"
                + "\n\t "
                + "\n\t -----------------------------------------------";
    }

    public void displayMainMenuView() throws SupplyControlException {

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
            System.out.println("\n\t" + this.menu);

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
            case "N": // create and start new game
                this.startNewGame();
                break;
            case "G": // get and start existing game
                this.startExistingGame();
                break;
            case "H": // display help menu
                this.displayHelpMenu();
                break;
            case "S": // save game
                this.saveGame();
                break;
            default:
                System.out.println("\n\t *** invalid selection *** try again ");
                break;
        }
        return false;
    }

    private void startNewGame() throws SupplyControlException {

        // create new game
        GameControl.createNewGame(OregonTrailDP1.getPlayer());

        // display the game menu
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.displayMenu();
    }

    private void startExistingGame() {
        System.out.println(" startExistingGame stub ");
    }

    private void displayHelpMenu() {

        // display help menu
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.displayMenu();
    }

    private void saveGame() {
        System.out.println(" saveGame stub ");
    }

}
