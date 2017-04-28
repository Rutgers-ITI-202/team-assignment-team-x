package adventure;

import java.util.ArrayList;
import java.util.Scanner;
/**
 * 
 * @author Keith, Kevin, Spencer
 * @version 1.0
 * @since 1.0
 * <h1>AdventureModel</h1>
 * <p>Primary game descriptor and content method. Containts the commman method and item interaction methods.</p>
 */
public class AdventureModel {

    // Read player input.
    static Scanner scan = new Scanner(System.in);

    // Initialise new map, 3x3.
    public static int[][] map = new int[3][3];

    // Get map of the game.
    public int[][] getMap() {
        return map;
    }

    // Initialise some objects.
    static Things invoice = new Things("a receipt with some info on it", "The invoice details a food with cocaine in it, which piques your interest. Just then, the door opens", "invoice");
    static Things tranquilizer = new Things("designed to knock someone out", "you trick the mice into thinking the tranquilizer is vicodin and the greedly eat it up. They pass out and you escape to the top of the cage", "tranquilizer");
    static Things toothpick = new Things("weak, but it might just do the job", "You jam the toothpick through the rabbit's eye and quickly climb up over the side of the cage", "toothpick");
    static Things key = new Things("a regular key, could be used to open something up", "You open up the cage and quickly jump out, the snake trailing just behind", "key");
    static Things poison = new Things("a small pill embossed with a skull & crossbones, and what appears to be a dead rat", "You tell the mice that the poison is actually LSD, and put it in their water tank. They quickly drink it and die. You climb to the top of the cage", "poison");
    static Things boxCutter = new Things("a little unwieldy, but sharp enough for quick combat", "you slice the guinea pig's throat and climb to the top of the cage", "box cutter");
    static Things laserPointer = new Things("shines a bright red light wherever it is pointed", "you click the laser on and shine it all around, distracting the animal just long enough for you to climb up the side of the cage", "laser pointer");
    static Things plasticBag = new Things("could be used to hold items... or smother small creatures", "you tie the plastic bag around the turtle's head, and as it struggles weakly for breath you make your escape", "a plastic bag");

    static Things animalFood = new Things("food for common animals", "         ", "animal food");
    static Things water = new Things("tepid water in a plastic bottle", "              ", "water");
    static Things shinyObject = new Things("what luster...", "             ", "shiny object");
    static Things animalDroppings = new Things("is that...?", "", "animal droppings");
    static Things chewedGum = new Things("a wad of chewed-up gum, still sticky", "              ", "chewed gum");
    static Things treat = new Things("appetizing for those with a canine disposition", "          ", "treat");

    // Create new ArrayList to store the objects.
    static ArrayList < Things > allThings = new ArrayList < Things > ();

    // Create a map of the rooms, assigning each room a number.
    static Rooms cheeksCage = new Rooms("Cheek's Cage", "a regular hamster cage", "invoice");
    static Rooms rabbitCage = new Rooms("Rabbit Cage", "a large cage with a rabbit in it", "toothpick");
    static Rooms catCage = new Rooms("Cat's cage", "a large crate with a cat in it", "laser pointer");
    static Rooms puppyCrate = new Rooms("Puppy's Crate", "a large crate with a small puppy in it", "laser pointer");
    static Rooms turtleCage = new Rooms("Turtle's Cage", "a small cage with a little pond and a turtle", "plastic bag");
    static Rooms mouseCage = new Rooms("Mouse's Cage", "a small cage with some mice in it", "tranquilizer");
    static Rooms ratCage = new Rooms("Rat's cage", "a small cage with some large rats in it", "poison");
    static Rooms guineaPigCage = new Rooms("Guinea Pig's cage", "a cage with a large guinea pig in it", "box cutter");
    static Rooms snakeCage = new Rooms("Snake's cage", "a cage with a large snake in it", "key");
    static Rooms checkoutCounter = new Rooms("Checkout Counter", "a regular old checkout counter", "andres");

    // Create new player object.
    static Adventurer cheeks = new Adventurer();

    // Get contents of each room.
    public void itemAdd() {
        cheeksCage.getContents().add(laserPointer);
        cheeksCage.getContents().add(invoice);
        cheeksCage.getContents().add(toothpick);
        rabbitCage.getContents().add(plasticBag);
        catCage.getContents().add(tranquilizer);
        catCage.getContents().add(treat);
        puppyCrate.getContents().add(key);
        turtleCage.getContents().add(poison);
        turtleCage.getContents().add(tranquilizer);
        mouseCage.getContents().add(treat);
        ratCage.getContents().add(boxCutter);
        guineaPigCage.getContents().add(plasticBag);
        snakeCage.getContents().add(toothpick);

        // Add objects to room.
        allThings.add(laserPointer);
        allThings.add(invoice);
        allThings.add(toothpick);
        allThings.add(plasticBag);
        allThings.add(tranquilizer);
        allThings.add(treat);
        allThings.add(key);
        allThings.add(poison);
        allThings.add(boxCutter);
        allThings.add(water);
        allThings.add(shinyObject);
        allThings.add(animalDroppings);
        allThings.add(chewedGum);
        allThings.add(animalFood);
    }

    // Handle player movement.
    static public boolean movement(String direction) {

        // Read player input to start the game.
        if (direction.equalsIgnoreCase("start")) {

            // Move along the dimensions of the array, corresponding to discrete rooms.
            for (int x = 0; x < map.length; x++) {
                for (int y = 0; y < map[0].length; y++) {
                    if (x == 0 && y == 0) {
                        map[x][y] = 0;
                    } else {
                        map[x][y] = 1;
                    }
                }
            }
            return false;
        }

        // Move north.
        if (direction.equalsIgnoreCase("north")) {
            for (int x = 0; x < 3; x++) {
                for (int y = 0; y < 3; y++) {
                    if (map[x][y] == 0 && x - 1 != -1) {

                        map[x][y] = 1;
                        map[x - 1][y] = 0;
                        System.out.println("You have entered the " + roomLookup().getName());
                        System.out.println(roomLookup().getDescription());
                        return true;
                    }
                }
            }
            return false;
        }

        // Move east.
        if (direction.equalsIgnoreCase("east")) {
            for (int x = 0; x < 3; x++) {
                for (int y = 0; y < 3; y++) {
                    if (map[x][y] == 0 && y + 1 != 3) {

                        map[x][y] = 1;
                        map[x][y + 1] = 0;
                        System.out.println("You have entered the " + roomLookup().getName());
                        System.out.println(roomLookup().getDescription());
                        return true;
                    }
                }
            }
            System.out.println("you cant go that way");
            return false;
        }

        // Move west.
        if (direction.equalsIgnoreCase("west")) {
            for (int x = 0; x < 3; x++) {
                for (int y = 0; y < 3; y++) {
                    if (map[x][y] == 0 && y != 0) {

                        map[x][y] = 1;
                        map[x][y - 1] = 0;
                        System.out.println("You have entered the " + roomLookup().getName());
                        System.out.println(roomLookup().getDescription());
                        return true;
                    }
                }
            }
            return false;
        }

        // Move south.
        if (direction.equalsIgnoreCase("south")) {

            for (int x = 0; x < 3; x++) {
                for (int y = 0; y < 3; y++) {
                    if (map[x][y] == 0 && x + 1 != 3) {
                        map[x][y] = 1;
                        map[x + 1][y] = 0;
                        System.out.println("You have entered the " + roomLookup().getName());
                        return true;
                    }
                }
            }
            return false;
        }
        return false;
    }


    // Intialise player input.
    public void command() {
        /**
         * @since 1.0
         * <h1> command <h1>
         * <p>Main command method. Asks the player for input, and uses a switch statement to call the corresponding method.</p>
         * @param      player input
         * @return     action
         */
        String in = "";
        System.out.println("What would you like to do? "); 
        
        // Format input.
        in = takeString(); in = in .toLowerCase(); in = in .trim();
        
        // Handle bad input.
        while (checkInput( in ) == false) {
            System.out.println("I'm not sure you can do that... Please try again with one of the following commands: \"take\",\"use\",\"drop\",\"inspect\",\"go north\",\"go east\",\"go south\", \"go west\", \"look around\", \"interact\" "); in = takeString();
        } 

        // Print appropriate actions to corresponding commands.
        switch ( in ) {
            case "look around":
                System.out.println(roomLookup().inspect());
                break;
            case "inspect":
                System.out.println("Which item?"); in = takeString();
                if (canAccess( in , roomLookup()) == true) {
                    itemLookup( in ).inspect();
                } else {
                    System.out.println("You don't have access to that...");
                }
                break;
            case "take":
                System.out.println("What do you want to take?"); in = takeString();
                if (canAccess( in , roomLookup()) == true) {
                    cheeks.take(itemLookup( in ));
                } else {
                    System.out.println("You don't have access to that...");
                }

                break;
            case "use":
                System.out.println("Which item?"); in = takeString();
                if (canAccess( in , roomLookup()) == true) {
                    plot(itemLookup( in ), roomLookup());
                } else {
                    System.out.println("You don't have access to that...");
                }

                break;
            case "interact":
                System.out.println("Which item?"); in = takeString();
                if (canAccess( in , roomLookup()) == true) {
                    plot(itemLookup( in ), roomLookup());
                } else {
                    System.out.println("You don't have access to that...");
                }

                break;
            case "drop":
                System.out.println("Which item?"); in = takeString();
                cheeks.drop(itemLookup( in ));
                break;
            case "go south":
                if (canMove(roomLookup()) == true) {
                    movement("south");
                } else {
                    System.out.println("Seems like you can't leave just yet...");
                }
                break;
            case "go north":
                if (canMove(roomLookup()) == true) {
                    movement("north");
                } else {
                    System.out.println("Seems like you can't leave just yet...");
                }
                break;
            case "go east":
                if (canMove(roomLookup()) == true) {
                    movement("east");
                } else {
                    System.out.println("Seems like you can't leave just yet...");
                }

                break;
            case "go west":
                if (canMove(roomLookup()) == true) {
                    movement("west");
                } else {
                    System.out.println("Seems like you can't leave just yet...");
                }
                break;
        }

    }

    // Check player input.
    static private boolean checkInput(String in ) {

        switch ( in ) {
            case "inspect":
                return true;
            case "use":
                return true;
            case "drop":
                return true;
            case "take":
                return true;
            case "go north":
                return true;
            case "go east":
                return true;
            case "go south":
                return true;
            case "go west":
                return true;
            case "look around":
                return true;
        }
        return false;
    }

    static private String takeString() {
        /**
         * @since v1.0
         * <h1> takeString <h1>
         * <p>Takes a string from the user and checks its validity.</p>
         */
        String in ;
        while (true) {
            try { 
            	in = scan.nextLine();
            } catch (Exception e) {
                scan.next();
                System.out.println("Bad input. Try again.");
                continue;
            }
            return in;
        }

    }

    static private void plot(AdventureObject item, Rooms place) {
    	/**
         * @since v1.0
         * <h1> plot <h1>
         * <p>Checks usage of key items for progression.</p>
         */
    	
    	// If the correct key item is used, the current room is cleared.
        if (place.getKeyItem().equals(item.getName())) {
            System.out.println(item.whenUsed());
            System.out.println();
            place.setIsBeat(true);
        } else {
        	
        	// Otherwise, do nothing.
            System.out.println("Nothing interesting happens.");
            System.out.println();
        }
    }

    // Allows the player to move to other rooms if the current room is cleared.
    static private boolean canMove(Rooms place) {
        if (place.getIsBeat() == true) {
            return true;
        }
        return false;

    }

    // Look up items in the list of all items.
    static private Things itemLookup(String in ) {
        for (int x = 0; x < allThings.size(); x++) {
            if ( in .equals(allThings.get(x).getName())) {
                return allThings.get(x);
            }
        }
        return null;

    }

    static private Rooms roomLookup() {
    	/**
         * @since v1.0
         * <h1> roomLookup <h1>
         * <p>Check current player coordinates and return the room.</p>
         * @param     current player coordinates
         * @return    current room
         */
    	
        for (int x = 0; x < map.length; x++) {
            for (int y = 0; y < map[0].length; y++) {
                if (map[x][y] == 0) {
                    if (x == 0 && y == 0) {

                        return cheeksCage;
                    }
                    if (x == 0 && y == 1) {
                        return rabbitCage;
                    }
                    if (x == 0 && y == 2) {
                        return catCage;
                    }
                    if (x == 1 && y == 0) {
                        return puppyCrate;
                    }
                    if (x == 1 && y == 1) {
                        return turtleCage;
                    }
                    if (x == 1 && y == 2) {
                        return mouseCage;
                    }
                    if (x == 2 && y == 0) {
                        return ratCage;
                    }
                    if (x == 2 && y == 1) {
                        return guineaPigCage;
                    }
                    if (x == 2 && y == 2) {
                        return snakeCage;
                    }
                }
            }
        }
        return null;
    }

    // Allow the player to access available itmes in the room.
    static private boolean canAccess(String item, Rooms place) {

    	// Loop through contents of room.
        for (int x = 0; x < place.getContents().size(); x++) {
            if (item.equals(place.getContents().get(x).getName())) {
                return true;
            }
        }
        
        // Loop through contents of inventory.
        for (int x = 0; x < cheeks.getInventory().size(); x++) {
            if (item.equals(cheeks.getInventory().get(x).getName())) {
                return true;
            }
        }
        return false;
    }
}