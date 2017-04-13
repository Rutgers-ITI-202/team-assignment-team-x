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
	boolean isBeat=false;
	String keyItem="";
	public Rooms(String n, String d, String k)// Constructor
	{
		this.name=n;
		this.description=d;
		this.keyItem=k;
		
	}
	
	public ArrayList<Things> getContents()
	{
		return this.contents;
	}
	public void  setIsBeat(boolean in)
	{
		this.isBeat=in;
	}
	public boolean getIsBeat()
	{
		return isBeat;
	}
	public String getKeyItem()
	{
		return this.keyItem;
	}
	public String getDescription()
	{
		return description;
	}
	
	
}