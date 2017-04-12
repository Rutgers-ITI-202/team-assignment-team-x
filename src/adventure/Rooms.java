package adventure;
//make this class extend another class with a inspect or look method that returns a description
import java.util.ArrayList;
import java.util.Scanner;
/**
 * 
 * @author Keith, Kevin, Spencer
 * @version 1.0
 * @since 1.0
 *  <h1> Description <h1>
 *  this class creates rooms and gives them the variable name, description and an arrayList of things called contents
 */
public class Rooms extends AdventureObject
{
	// define room traits
	
	ArrayList<Things> contents = new ArrayList();
	
	public Rooms(String n, String d)// Constructor
	{
		name=n;
		description=d;
		
	}
	
	public ArrayList<Things> getContents()
	{
		return this.contents;
	}
	
	
}