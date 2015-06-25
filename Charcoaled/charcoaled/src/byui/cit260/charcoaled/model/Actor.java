/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.charcoaled.model;

import java.awt.Point;
import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author eucosta
 */
public enum Actor implements Serializable{
    
    FirefighterOne("Male Firefighter"),
    FirefighterTwo("Female Firefighter");
    
    //class instance variables
    private final String description;
    private final Point coordinates;
    
    private Item item;
    private Location location;    
    Actor(String description){
        this.description = description;
        coordinates = new Point(1,1);
    }
    
    public String getDescription(){
        return description;
    }
    
    public Point getCoordinates(){
        return coordinates;
    }
    
    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }
    
    public Location getLocation() {
        return location;
    }
    
    public void setLocation(Location location) {
        this.location = location;
    }
}
