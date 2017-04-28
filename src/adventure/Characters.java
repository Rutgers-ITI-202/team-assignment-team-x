package adventure;
/**
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