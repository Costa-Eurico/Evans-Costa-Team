/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.charcoaled.model;

import java.io.Serializable;

/**
 *
 * @author ih8pcs
 */
public class Map implements Serializable{
    
    private int stairCount;
    private int doorCount;
    private int roomCount;
    private int noOfRows;
    private int noOfColumns;
    
    private Location location;
    private Location[][] locations;
    private Game[] game;
    
    public Map() {
    }
    
    class Coordinates {
        int x;
        int y;
        
        public Coordinates(int x, int y) {
            this.x = x;
            this.y = y;            
        }
        
        public int hashCode() {
            return new Integer(x + "0" + y);
        }
    }

    public Map(int noOfRows, int noOfColumns) {
        
        if (noOfRows < 1 || noOfColumns < 1) {
            System.out.println("The number of rows and columns must be > zero");
            return;
        }
        
        this.noOfRows = noOfRows;
        this.noOfColumns = noOfColumns;
        
        // create 2-D array for Location objects
        this.locations = new Location[noOfRows][noOfColumns];
        
        for (int row = 0; row < noOfRows; row++) {
            for (int column = 0; column < noOfColumns; column++) {
                // create and initialize new Location object instance
                Location location = new Location();
                location.setColumn(column);
                location.setRow(row);
                location.setVisited(false);
                
                // assign the Location object to the current position in array
                locations[row][column] = location;
            }
        }
    }
    
    public static int getNoOfRows() {
        int rows = 5;
        return rows;
    }
    
    public static int getNoOfColumns() {
        int columns = 5;
        return columns;
    }
    
    public void setLocations(Location[][] locations) {
        this.locations = locations;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public Location[][] getLocations() {
        return locations;
    }

    public Location getLocation() {
        return location;
    }
    
    public int getStairCount() {
        return stairCount;
    }

    public void setStairCount(int stairCount) {
        this.stairCount = stairCount;
    }

    public int getDoorCount() {
        return doorCount;
    }

    public void setDoorCount(int doorCount) {
        this.doorCount = doorCount;
    }

    public int getRoomCount() {
        return roomCount;
    }

    public void setRoomCount(int roomCount) {
        this.roomCount = roomCount;
    }

    @Override
    public String toString() {
        return "Map{" + "stairCount=" + stairCount + ", doorCount=" + doorCount + ", roomCount=" + roomCount + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 89 * hash + this.stairCount;
        hash = 89 * hash + this.doorCount;
        hash = 89 * hash + this.roomCount;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Map other = (Map) obj;
        if (this.stairCount != other.stairCount) {
            return false;
        }
        if (this.doorCount != other.doorCount) {
            return false;
        }
        if (this.roomCount != other.roomCount) {
            return false;
        }
        return true;
    }

    public Game[] getGame() {
        return game;
    }

    public void setGame(Game[] game) {
        this.game = game;
    }
}
