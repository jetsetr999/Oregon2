/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oregontraildp1;


import Exceptions.SupplyControlException;
import OregonTrail.Model.Game;
import OregonTrail.Model.Map;
import OregonTrail.Model.Player;
import OregonTrail.View.StartProgramView;
import OregonTrail_Enum.ActorEnum;
import OregonTrail_Enum.EventEnum;
import OregonTrail_Enum.GameEnum;
import OregonTrail_Enum.InventoryEnum;
import OregonTrail_Enum.InventoryItemEnum;
import OregonTrail_Enum.MapEnum;
import OregonTrail_Enum.RiverCrossingEnum;
import OregonTrail_Enum.SceneEnum;
import OregonTrail_Enum.SupplyEnum;


/**
 *
 * @author Darrin
 */
public class OregonTrailDP1 {

    private static Game currentGame = null;

    public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game currentGame) {
        OregonTrailDP1.currentGame = currentGame;
    }

    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        OregonTrailDP1.player = player;
    }
    private static Player player = null;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SupplyControlException {
        
        // display the start program view
        StartProgramView startProgramView = new StartProgramView();
        startProgramView.diplayStartProgramView();
        
        
        Player playerOne = new Player();

        playerOne.setName("Jose Conseco");
        playerOne.setBestTime(7.00);

        //String playerOneName = playerOne.getName();
        //double playerOneTime = playerOne.getBestTime();
        System.out.println(playerOne.toString());

        ActorEnum Avatar1 = ActorEnum.Doctor;
        System.out.println(Avatar1.toString());
        
        MapEnum Map = MapEnum.Hotel;
        System.out.println(Map.toString());

        SupplyEnum Supplies = SupplyEnum.Sell;
        System.out.println(Supplies.toString());
        
        SceneEnum Place = SceneEnum.Fort;
        System.out.println(Place.toString());
        
        RiverCrossingEnum Cross = RiverCrossingEnum.Raft;
        System.out.println(Cross.toString());
        
        GameEnum Option = GameEnum.Actors;
        System.out.println(Option.toString());
        
        EventEnum suffering = EventEnum.Attack;
        System.out.println(suffering.toString());
        
        InventoryEnum Product = InventoryEnum.Required;
        System.out.println(Product.toString());
        
        InventoryItemEnum Item = InventoryItemEnum.Wagon;
        System.out.println(Item.toString());
        
        
    }

    

}
