package adventure;
/**
<<<<<<< HEAD
 * @author Keith, Kevin, Spencer
 * @version 1.0
 * @since 1.0
 *  <h1> Characters <h1>
 *  <p>Initialise characters as extensions of interactable game objects.</p>
 */

public class Characters extends AdventureObject implements Usable {
	
	// Initialise dialogue.
    String used;
    String voiceLine = "";
=======
 * 
 * @author Keith, Kevin, Keith
 * @since 2.0
 * <h1> Description </h1>
 * This class holds information about characters in the game and their constructor
 *
 */

public class Characters extends AdventureObject implements Usable 
{
	String used;
	
	
	public Characters(String n,String d ,String u)
	{
		this.used=u;
		this.description=d;
		this.name=n;
	}
	public String whenUsed() 
	{
		return used;
	}
>>>>>>> origin/master

    // Constructor for dialogue.
    public Characters(String u, String vc) {
        this.used = u;
        this.voiceLine = vc;
    }
    
    // Check if the character has already been spoken to.
    public String whenUsed() {
        return used;
    }

}