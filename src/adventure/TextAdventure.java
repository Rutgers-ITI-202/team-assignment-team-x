package adventure;

import java.util.Scanner;
/**
 * 
 * @author Keith, Kevin, Spencer
 * @version 1.0
 * @since 1.0
 * <h1> TextAdventure </h>
 * <p>Main game loop.</p>
 * @param      player input, ask player if they want to begin game
 * @return     run the game
 *
 */
public class TextAdventure {

    public static void main(String[] args) {

        // Main game loop.
    	
    	// Initialise new game runner.
        AdventureModel runner = new AdventureModel();
        
        // Initialise new items.
        runner.itemAdd();
        
        // Initialise player movement.
        runner.movement("Start");
        
        // Initialise worl map.
        for (int x = 0; x < runner.getMap().length; x++) {
            for (int y = 0; y < runner.getMap()[0].length; y++) {
                System.out.print(runner.getMap()[x][y]);
                System.out.print(" ");
            }
            System.out.println();

        }
        
        // Allow player to enter commands.
        while (true) {
            runner.command();
        }
    }


}