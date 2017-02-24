package adventure;

public class Things 
{ 
	// we can use these decelerations for things that may effect gameplay
	
	static boolean flashlightOn =false;
	
  public static void desk()
  {
	  System.out.println("you riffle through the desk but you find nothing of interest");
  }
  public static void note()
  {
	  System.out.println("PLEASE ADD SOMETHING ABOUT THE PLOT");
  }
  public static void flashlight()
  {
	  System.out.println("you click the flashlight on and it lights up the room");
	  flashlightOn=true;
  }
}
