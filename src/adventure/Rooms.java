package adventure;

import java.util.ArrayList;
import java.util.Scanner;
/**
 * @author Keith, Kevin, Spencer
 * @version 1.0
 * @since 1.0
 *  <h1> Rooms <h1>
 *  <p>Initialises rooms with a name, description and contents.</p>
 *  @return     name
 *  @return     description
 *  @return     contents of room, stored in an ArrayList
 */
public class Rooms extends AdventureObject implements Inspectable {
    // Initialise new ArrayList to store the contents of the room.
    ArrayList < Things > contents = new ArrayList();

    // Check to see if the room has already been cleared; false by default.
    boolean isBeat = false;

    // Initialise key item for progression.
    String keyItem = "";

    // Constructor for room data.
    public Rooms(String n, String d, String k) 
    {
        this.name = n;
        this.description = d;
        this.keyItem = k;

    }

    // Get contents of the room.
    public ArrayList < Things > getContents() {
        return this.contents;
    }
    
    // Set the room's status to clear.
    public void setIsBeat(boolean in ) {
        this.isBeat = in ;
    }
    
    // Check if room has been cleared.
    public boolean getIsBeat() {
        return isBeat;
    }
    
    // Fetch key item necessary to progress.
    public String getKeyItem() {
        return this.keyItem;
    }
    
    // Fetch room description.
    public String getDescription() {
        return description;
    }


}