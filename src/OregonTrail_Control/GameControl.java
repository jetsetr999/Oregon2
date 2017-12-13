/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OregonTrail_Control;

import OregonTrail.Model.Game;
import OregonTrail.Model.Inventory;
import OregonTrail.Model.Player;
import OregonTrail_Enum.InventoryItemEnum;
import oregontraildp1.OregonTrailDP1;

/**
 *
 * @author Darrin
 */
public class GameControl {

    public static Player createPlayer(String name) {

        if (name == null) {
            return null;
        }

        Player player = new Player();
        player.setName(name);

        OregonTrailDP1.setPlayer(player); // save the player
        return player;
    }

    public static void createNewGame(Player player) {
        Game game = new Game();
        game.setPlayer(player);

        game.getItems().add(new Inventory(InventoryItemEnum.Chicken, 65));
        game.getItems().add(new Inventory(InventoryItemEnum.Axle, 4));
        game.getItems().add(new Inventory(InventoryItemEnum.Horse, 2));
        
        OregonTrailDP1.setCurrentGame(game);
        
        
    }

}

