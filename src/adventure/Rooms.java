package adventure;

import java.util.ArrayList;
import java.util.Scanner;
/**
 * 
 * @author Keith
 * @version 1.0
 * @since 1.0
 *  <h1> Description <h1>
 *  this class creates rooms and gives them the variable name, description and an arrayList of things called contents
 */
public class Rooms 
{
	String name;
	String description;
	ArrayList<Things> contents = new ArrayList();
	
	public Rooms(String n, String d, ArrayList<Things> RoomContents)
	{
		name=n;
		description=d;
		contents=RoomContents;
	}
	
	
	
	
}
