
package adventure;

import java.util.Scanner;
/**
 * 
 * @author Keith, Kevin, Spencer
 * @version 2.0
 * @since 1.0
 * <h1> Description </h>
 * This is the main loop for the adventure text program it describes the first room and then asks if the user would like to play and then starts the game
 * @param      player input, ask player if they want to begin game
 * @return     run the game
 */
public class TextAdventure {
	
	public static void main(String[] args) 		//Method that runs the main game
	{
		/**
		 * @since 2.0
		 * <h1> Description </h1>
		 * This method runs the game 
		 */
		
		
		AdventureModel runner=new AdventureModel();
		runner.itemAdd();
		System.out.println("Hello there! Welcome to Cheeks’ Adventure! You are entering the world of the adorable little hamster named Cheeks. You will have to navigate through the pet store and find items that help you defeat the other characters. You can observe the room and the objects in it by the command ‘Look Around.’ This will describe the room and its contents. In order to interact with the objects you can use the following commands: take, use, drop, and inspect. \n");
		System.out.println("Inspect- Describes the item or character\nTake- adds the item to your inventory\nUse- Uses an item \nDrop- Removes and item from your inventory \n");
		System.out.println("You can move from room to room by the commands ‘go north,’ ‘go south,’ ‘go east,’ or ‘go west.’ Please note that you can only advance to a new room after defeating the character in the current room. Otherwise, you can only move back to previous rooms.");
		System.out.println();//gives the player a useful tip to beat the game quicker
		System.out.println("would you like to play");
		int x=0;
		String play= runner.takeString();
		
		if(play.equalsIgnoreCase("yes"))
		{
			runner.movement("start");
			while(runner.isGameOver()==false)//checks to see if the user can go to the last room
			{
				runner.command();
				while(runner.isGameOver()==true && runner.isAndresBeat()==false)//runs until the game ends
				{
					if(x==0)
					{
						runner.movement("end game"); //moves the player to the last room
						x++;
					}
					runner.command();	
				}
				System.out.println();
				if(runner.isAndresBeat()==true)
				{
					break;
				}
		}
		System.out.println("thanks for playing");
		
		
	}
	

}
}