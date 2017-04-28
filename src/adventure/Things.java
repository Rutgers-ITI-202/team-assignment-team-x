package adventure;
//make this class extend another class with a inspect or look method that returns a description
/**
 * 
 * @author Keith, Kevin, Spencer
 * @version 1.0
 * @since 1.0
 *  <h1> Description <h1>
 *  <p>Initialises game objects and gives them descriptions.</p>
 *  <p>return     name
 *  <p>return     description</p>
 *  <p>return     whenUser : a description of what happens when the object is interacted with</p>
 *  <p>return     boolean : set to true when used so the player knows if the item is being used or not.</p>
 */
public class Things extends AdventureObject implements Usable {

    // Register player interaction.
    String whenUsed = "";

    // Check to see if the object is currently being interacted with.
    boolean used = false;

    // Constructor for individual objects.
    public Things(String d, String WU, String n) {

        this.description = d;
        this.whenUsed = WU;
        this.name = n;
    }

    // Constructor for item description.
    public void setDescription(String in ) {
        this.description = in ;
    }

    // Constructor for interaction status.
    public void setUsed(boolean in ) {
        this.used = in ;
    }

    // Constructor for usage status.
    public String whenUsed() {

        return this.whenUsed;
    }


}