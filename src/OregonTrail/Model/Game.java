/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OregonTrail.Model;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Darrin
 */
public class Game implements Serializable {

    private double totalTime;
    private int noPeople;
    private Player player;
    private ArrayList<Inventory> items;
    
    public Game() {
        items = new ArrayList<Inventory>();
        
    }

    public ArrayList<Inventory> getItems() {
        return items;
    }

    public void setItems(ArrayList<Inventory> items) {
        this.items = items;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    
    
}
