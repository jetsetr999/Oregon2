/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OregonTrail_Control;

import Exceptions.MapControlException;
import Exceptions.SupplyControlException;
import OregonTrail.Model.Game;
import OregonTrail.Model.Map;
import OregonTrail.Model.Player;
import OregonTrail_Enum.MapEnum;
import java.util.ArrayList;

import oregontraildp1.OregonTrailDP1;

/**
 *
 * @author Darrin
 * 
 */
public class MapControl {
    
    public void  mapLocationList(ArrayList<Map> mapList) 
            throws MapControlException {
        if(mapList == null){
            throw new MapControlException("Can not be blank try again"); 
        }
        
        double mapPlace = 0;
        
       
               
        /*Map map = new Map();
        Map location;
        //map.setMap(location);
 
        map.getLocations().add(new Map(MapEnum.Hotel));
        //game.getPlaces().add(new Inventory(InventoryItemEnum.Axle, 4));
        //game.getPlaces().add(new Inventory(InventoryItemEnum.Horse, 2));
        
        OregonTrailDP1.setCurrentMap(map);*/
        
        
    }

    

    
}
    
