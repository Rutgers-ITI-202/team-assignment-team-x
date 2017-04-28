package adventure;
/**
 * @author Keith, Kevin, Spencer
 * @version 1.0
 * @since 1.0
 *  <h1> AdventureObject <h1>
 *  <p>Initalise game objects.</p>
 *  @param     inspect game objects
 *  @return    name
 *  @return    description
 *  @return    whether the object is being used or not.
 */
public class AdventureObject implements Inspectable, Usable {
    String description;
    String name;

    // Get the name of the object upon observation.
    public String getName() {
        return name;
    }
    
    // Inspect the object and return the description.
    public String inspect() {

        return description;
    }

    // Check to see if the object is being used.
    public String whenUsed() {

        return "";
    }



}