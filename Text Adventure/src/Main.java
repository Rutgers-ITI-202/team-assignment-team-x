/**
 * Text adventure Main, for ITI 202: Object-Oriented Programming.
 */
/**
 * @author Spencer Yan
 */

import java.util.Scanner;

class Input {
	
	/** 
	 * <h1>Input</h1>
	 * 
	 * <p>This script is used to normalise player input into a pre-defined and easily manipulatable format.</p>
	 * 
     * @param    player input   the player's commands, entered as a string
     * @return   player input   the player's commands, interpreted as a string formatted in all lower case
     */
	
    public static String getInput() {
    	
        System.out.print("\n> ");
        Scanner text = new Scanner(System.in);
        String input = text.nextLine();
        input.toLowerCase();
        return input;
    }
}


public class Main {

    /**
     * <h1>Main</h1>
	 * 
	 * <p>This script contains the main game loop.</p>
     */

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        // Control whether or not the player is currently the game.
        boolean active = true;

        // Initialise room description, and items: table, and piece of paper.
        System.out.println("You are alone in a room.\n\nThere is a table, and a piece of paper.");

        // Main game loop.
        while (active) {

            // Initialise player input.
            String playerInput = Input.getInput();

            /* OBSERVATION COMMANDS */
            
            // What this does is split the string entered by the player into two segments: the command, and the object. 
            // How it does this is by counting the letters of the command phrase (here, they all coincidentally happen 
            // to be 7, plus the space adding up to 8, but that's not necessary at all), and splitting that into a 
            // substring, which is then compared to the listed commands, ignoring case.
            
            // These commands, and their synonyms, will probably eventually be stored in a separate enum class for
            // sake of accessibility and legibility.
            
            if (playerInput.substring(0, 8).equalsIgnoreCase("look at ") ||
                playerInput.substring(0, 8).equalsIgnoreCase("examine ") ||
                playerInput.substring(0, 8).equalsIgnoreCase("observe ")) {
            	
            	// Each individual subject of the parent actions is listed here individually, again using the same process
            	// of splitting the string into two substrings in order to determine the object of interest. Here, it uses
            	// the final position of the first substring (this will be adapted in the future to be more flexible), and
            	// reads it to the end of the string.
            	
            	// This should eventually be converted into a switch statement for legibility. 
            	// The objects themselves will probably be stored in an array list. 
            	
            	System.out.println();
            	 
                if (playerInput.substring(8, playerInput.length()).equalsIgnoreCase("room")) {
                    System.out.println("The walls are featureless, and barren. They are of a slightly ashen hue.\n\nYou see no means of either entrance or exit.");
                } else if (playerInput.substring(8, playerInput.length()).equalsIgnoreCase("table")) {
                    System.out.println("The table is simple and unremarkable, made of what appears to be cheap dark wood. It seems to be bolted into the ground with steel rivets.");
                } else if (playerInput.substring(8, playerInput.length()).equalsIgnoreCase("paper") || playerInput.substring(8, playerInput.length()).equalsIgnoreCase("piece of paper")) {
                    System.out.println("The paper is a white sheet of standard printer paper, typically found in offices. Upon it is drawn what appears to be a circle, in heavy black ink.");
                } else if (playerInput.substring(8, playerInput.length()).equalsIgnoreCase("circle") || playerInput.substring(8, playerInput.length()).equalsIgnoreCase("ring")) {
                    System.out.println("The circle is heavy and dense with ink. Looking at it makes you feel like someone's groping around inside your skull.");
                }
            }

            // Allow the player to exit the room, and end the game.
            else if (playerInput.equals("exit")) {
                System.out.println("You leave the room.");
                active = false;

            // Default catch-all for invalid commands.
            } else {
                System.out.println("I'm pretty sure you can't do that.");
            }
        }
        
        // Close the game.
        System.exit(0);
    }
}