
package adventure;

import java.util.Scanner;
/**
 * 
 * @author Keith, Kevin, Spencer
 * @version 1.0
 * @since 1.0
 * <h1> Description </h>
 * This is the main loop for the adventure text program it describes the first room and then asks if the user would like to play and then starts the game
 *
 */
public class TextAdventure {
	
	public static void main(String[] args) 		//Method that runs the main game
	{
		
		
		 AdventureModel runner=new AdventureModel();
		runner.itemAdd();
		runner.movement("start");
		for(int x=0; x<runner.getMap().length;x++)
		{
			for(int y=0;y< runner.getMap()[0].length; y++)
			{
				System.out.print(runner.getMap()[x][y]);
				System.out.print(" ");
			}
			System.out.println();
				
		}
		while(true)
		{
			runner.command();
		}
	}
	

}