

package adventure;

import java.util.Scanner;
/**
 * 
 * @author Keith
 * @version 1.0
 * @since 1.0
 * <h1> Description </h>
 * This is the main loop for the adventure text program it describes the first room and then asks if the user would like to play and then starts the game
 *
 */
public class TextAdventure {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		AdventureModel.roomDescription();
		String in="";
		System.out.println("would you like to play the game");
		in=scan.nextLine();
		if(in.equalsIgnoreCase("yes"))
		{
			AdventureModel.command();
		}
		
		
		
	}

}
