
package adventure;

import java.util.Scanner;
/**
 * 
 * @author Keith, Kevin, Spencer
 * @version 2.0
 * @since 1.0
 * <h1> Description </h>
 * This is the main loop for the adventure text program it describes the first room and then asks if the user would like to play and then starts the game
 *
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
		System.out.println("Tip: take all the objects in every room you enter you have a giant backpack and you never know when they may be useful"); //gives the player a useful tip to beat the game quicker
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