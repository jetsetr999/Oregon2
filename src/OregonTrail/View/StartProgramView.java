/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OregonTrail.View;

import Exceptions.SupplyControlException;
import OregonTrail.Model.Player;
import OregonTrail_Control.GameControl;
import java.util.Scanner;

/**
 *
 * @author Darrin
 */
public class StartProgramView {
    
    private final String promptMessage;
    
    
    public StartProgramView(){
        // promptMessage = enter name
        this.promptMessage = "\n\t please enter your name: ";
        
        // diplay the banner when view is created
        this.displayBanner();
    }

    private void displayBanner() {
        
        System.out.println(
                      "\n\t*********************************************************"
                    + "\n\t*                                                       *"
                    + "\n\t* This is a text based game of strategy and chance.     *"
                    + "\n\t* In this game you will help the pioneers reach the     *"
                    + "\n\t* Squaw valley before the first snowfall.  You and your *"
                    + "\n\t* family will need to strategize and decide how much    *"
                    + "\n\t* food and supplies are needed for the journey at hand. *"
                    + "\n\t* Hunting supplies would be very helpful in assisting   *"
                    + "\n\t* with food needs.  There are many stops and            *"
                    + "\n\t* unnexpected events along the way.  Animals and a      *"
                    + "\n\t* wagon will be part of your needed supplies.           *"
                    + "\n\t*                                                       *"
                    + "\n\t* Good luck and enjoy the ride.                         *"
                    + "\n\t*                                                       *"
                    + "\n\t*********************************************************"
            );
    }

    public void diplayStartProgramView() throws SupplyControlException {
       
        boolean done = false; 
        do{
            //prompt for and gget players name
            String playersName = this.getPlayersName();
            if(playersName.toUpperCase().equals("Q")) // allow user to quit
                return; // exit the game
            
            // do the requested action and display
            done = this.doAction(playersName);
        }while(!done);
    }

    private String getPlayersName() {
        Scanner keyboard = new Scanner(System.in); // get infile
        String value = ""; // return value
        boolean valid = false; // not valid
        
        while(!valid){ // loop to get valid name
            System.out.println("\n\t" + this.promptMessage);
            
            value = keyboard.nextLine(); 
            value = value.trim(); // trim off blanks
            
            if(value.length() < 1){ // value is blank
                System.out.println("\n Invalid entry: name can not be blank ");
                continue;
            }
            break; // end the loop
        }
        return value; // return the name
    }

    private boolean doAction(String playersName) throws SupplyControlException {
        
        if(playersName.length() < 2 ){
        System.out.println("\n Invalid players name: "
                + " The name must be greater than one character in length ");
        return false;
        }
    Player player = GameControl.createPlayer(playersName);
    
    if(player == null){
        System.out.println("\nError creating the player.");
        return false;
    }
    // display next view
    this.displayNextView(player);
    return true;  //success 
    }

    private void displayNextView(Player player) throws SupplyControlException {
        
        // display a welcome message
        System.out.println( "\n\t ----------------------------------------"
                          + "\n\t Welcome to the game " + player.getName()
                          + "\n\t Enjoy the ride and have fun!"
                          + "\n\t ----------------------------------------");
        
        // create MainMenuView object
        MainMenuView mainMenuView = new MainMenuView();
                
        // display the main menu view
        mainMenuView.displayMainMenuView();
    }
}
