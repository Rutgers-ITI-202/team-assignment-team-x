package adventure;

import java.util.ArrayList;
import java.util.Scanner;
/**
 * 
 * @author Keith, Kevin, Spencer
 * @version 2.0
 * @since 1.0
 * <h1>AdventureModel</h1>
 * <p>Primary game descriptor and content method. Containts the commman method and item interaction methods.</p>
 */
<<<<<<< HEAD
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
=======
public class AdventureModel
{
		static Scanner scan = new Scanner(System.in);
		public static int [][] map= new int [3][3];
		static boolean gameOver=false;
		static boolean beatAndres= false;
		public int [][] getMap()
		{
			return map;
		}
	
		//Creates all the things in the game
		//description, used, name
		static Things invoice = new Things("You see a shredded piece of paper with some text on it.","It looks like a shipping invoice… The store just received \"Magic Pellets.\" These were your favorite hamster food in Colombia. Unfortunately because of the coca leaves used to produce the food, it is illegal in the United States. It has been many years since you have had these delicious treats. You must go find them!","invoice");
		static Things tranquilizer = new Things("There are some pills on the ground. They look like tranquilizers!","You slip the tranquilizer in their food, and wait patiently for them to pass out.................. You can move through now.","tranquilizer");
		static Things toothpick = new Things("The toothpick looks ordinary and wooden. Though this one looks rather sharp.","You just stabbed the rabbit through the throat. There is blood everywhere. You wipe it from your face and watch as he twitches on the ground.","toothpick");
		static Things key = new Things("This looks like an ordinary key. I wonder what it opens…","You unlock Sarah's cage and set her free. She is so very grateful that she is no longer prisoner to 4 walls. You have gained a life-long friend.","key");
		static Things poison= new Things("The rat poison is made of blue pellets and resembles mouse food.","You slip the rat poison in their food. Rather than pass through, you stick around to watch them die. After all, the only joy you find in life is from watching others lose theirs.","poison");
		static Things boxCutter = new Things("Be careful! The blade is out. An employee must have left this out.","You pulled out the box cutter. You slip behind Gary, and glide the blade across his throat. The gargling sounds of blood make you feel whole again. ","box cutter");
		static Things laserPointer = new Things("This one has a full battery!","You pulled out your laser pointer. The animal is distracted by the red dot. He wants to catch it! Get away while you can.","laser pointer");
		static Things plasticBag = new Things("The plastic bag is empty and looks like it could sufficate an animal","You pull the plastic bag over the turtle's head. He struggles… You hold your ground as the struggling gets weaker. You wait until he stops kicking. He picked the wrong day to mess with Cheeks.","plastic bag");
		//static Things treat = new Things("There looks to be a dog treat in the corer. Its strange that the cat hasn’t eaten it!","You give the puppy the treat and he start to eat it and loses intrest in you","treat");
		static Things bat = new Things("Solid oak, hamster-sized","You hit Andres with the bat and knocked him off the counter, onto the floor. Your friend Sarah the snake is right there waiting for him. She said she was hungry,\nhopefully she finishes the jo……. She begins to swallow him whole! You grab the magic pellets, and take a moment to sit on the counter and reflect. As the sweet sounds of Andres' screaming and cries for life fill your ears, you are reminded of the \n things that are important in this world. Sarah the snake has reminded you of the value of friends. At the same time, if you hadn't made friends with Andres many years ago, he would have never become you enemy in the first place. You realize now with your new friendship here,\nits time to move on. You feel its important to not get attached to anything you aren't willing to walk out on in 30 seconds flat- if you feel the heat around the corner (yes thats Robert De Niro in Heat). It looks like it is time for this Hamster to move on.","bat");
		//creates all the characters in the game
		 //name, , description , used
		static Characters jack = new Characters("jack","Jack the rabbit, is a rather large and fluffy bunny. He seems to get angry really easily. You always suspected he had a steroid problem…","Jack:\"Why are you out of your cage? You’ve been here for a few weeks and have never left before. What's so important this time?\"\n You: \"You don't want to get involved. If I told you, I would have to kill you.\"\n Let me see that piece of paper…. Ohhhh some tasty treats I see. Well, you're not getting any if I have anything to say about it.\""  );
		static Characters clyde = new Characters("clyde","Clyde the cat looks to be really hungry. He is skinny and looks malnourished. He has a strange, vacant look in his eyes.","Clyde: \"Ohhh, lucky me! It looks as though a meal just fell into my cage.\"\n You: \"You don't want to do that… I'm going to be leaving this cage in one piece. You can either let me go, or I will have to make you.\" \n Clyde: \"That sounds like something I can sink my theeth into.\" ");
		static Characters puppy = new Characters("puppy","This pupper looks like a very good boy.","Puppy: woof!");
		static Characters terry = new Characters("terry","This turtle is bigger than you. He looks fairly old and weathered. His beak looks rather sharp.  Be careful!","Terry:\"I know why you're here… the magic pellets. Andres knows about them, and is already after them. He has promised to share some of them with me, so I'm aftraid this will be the last cage you step into today.\"\n ***You haven't seen Andres in years.  He was your friend at the rodent orphanage back in Colombia. He is now the leader of the Colombian gerbil cartel. You guys began to grow apart as you got older. He chose the street life, and you tried your best to avoid it. Though it seems now that trouble has found you.**** Terry: \"I'm sorry, but I can't let you leave here.\"");
		static Characters gerbil = new Characters("gerbil","There looks to be about 5 of them. They are all soft, round, and cute. ","They seem disctracted");
		static Characters rats = new Characters("rats","They just look like rats….","they are running around you cant get their attention");
		static Characters gary = new Characters("Gary","Gary looks a little unstable and unhinged. His eyes appear vacant and deranged. He hasn’t had sleep in weeks. He looks like he wants to eat you.","Gary: \"Well, look who decided to show. We were hoping to see you soon.\"\n You: \"We?... You're the only one here?\"\n Gary: \"We know what you're after. Andres promised us a cut of the loot too.\"\n You:\"Alright, this is getting a little weird for me \"\n Gary: \"You will never get the magic pellets.\" *Starts moving closer* ");
		static Characters Sarah = new Characters("Sarah","Sarah is long and green… like a snake. Duh"," Sarah: \"So you are after the pellets too?\"\n You: \"There's nothing you can do about it. I'm sorry, but if you don't let me pass, your life ends right here, right now.\" \n Sarah: \"Oh goodness no! I have no interest in your silly hamster food. I am just tired of watching the world from my little cage. Though I am a little hungry now that you mention it.\"\n  ***You must change Sarah's mind about eating you***");
		static Characters andres = new Characters("Andres","Andres is small, cute, and fluffy. He sounds like he's angry, but then again he's so cute. But you should still probably kill him.","Andres: \"Look who it is. I'm so happy that you are the person I run into up here.\" \n You: \"Give me the pellets.\"\n  Andres: \"Is that anyway to talk to an old friend? Where are your manners?\"\n You: \"You made it like this. Not me. Now give me the pellets.\" Andres: \"I'm afraid I can't do that. But I am glad that I am the one who gets to watch you die.\" ");
		
		static ArrayList<AdventureObject> allThings = new ArrayList <AdventureObject>();//this array list is used to check if the player can access a given item
		//name, description, key item, plot, character
		static Rooms cheeksCage = new Rooms("Cheek's Cage", "The food bowl is empty. There is some water left in feeder. There is a toothpick in the corner and laser pointer leaning up against the far wall of your cage. There is cage filling lining the bottom of your cage. It looks like pieces of an invoice.","invoice","Your name is Cheeks, the Hamster. You are originally from Colombia. You have been in a new pet store for 3 weeks. This is your 10th store since you have immigrated to the United States. You have been transferred throughout the pet store sytem for the last 2 years. It seems you are more at home by not having a home. You like it that way. The fewer people in your life, the fewer problems you have. You wake up from an ordinary nap, and look around.", null);
		static Rooms rabbitCage = new Rooms("Rabbit Cage", "The food bowl is empty. There is no water. There is a plastic bag lying on the ground. There is a large rabbit who seems very interested in your adventure.","toothpick","In the rabbit cage, you are immediately confronted by a rabbit who inquires about your journey. He now wants what you’re after. He must be stopped. He looks like he can kick you pretty hard.", jack);
		static Rooms catCage = new Rooms("Cat Cage","The cat cage looks like a flop house barren and dark. The food and water bowls are empty. There is also a cat who must be very hungry. There are also pet tranquilizer pills on the ground. ","laser pointer","As soon as you walk into the cat cage, Clyde the cat immediately notices you. It seems that he thinks you are either a toy or food? As a small rodent, you have to be very careful. ", clyde);
		static Rooms puppyCrate = new Rooms("Puppy Crate","The puppy pen is full of golden retriever puppies. They are playfully rolling around. The floor of the pen has puppy toys and serveral food bowls. The food bows are all empty. There is something shiny on the ground- it looks like a key.","laser pointer","When you walk into the puppy pen, one of the dogs stops playing and notices you immediately. He lets out a playful growl under his breath. It looks like he thinks you are a toy! If he starts chewing on you, he probably won't let you go!", puppy);
		static Rooms turtleCage = new Rooms("Turtle Cage", "This cage has rocks and shallow waters for the turtles. There is a food bowl that has some food left in it. There is also plenty of drinking water. You also notice some rat poison in the near corner.", "plastic bag", "As soon as you enter the turtle tank, the turtle notices you. He comes charging at you with the blinding speed of … a turtle. Be careful- he is a snapping turtle!", terry);
		static Rooms gerbilCage = new Rooms ("Gerbil Cage", "This cage has several gerbils. There is food and water. They are all huddled over the bowls. There is a puppy treat on the ground next to the bowl. The floor is lined with cage filling. You also just stepped in some poop.","tranquilizer", "In the Gerbil cage, you encounter several of Andres’ lackeys. You already know that they are waiting for you. They aren’t going to let you get the magic pellets first. However, it looks like they are furiously eating- they don't see you yet.  ", gerbil);
		static Rooms ratCage = new Rooms ("Rat Cage","There are several rats in this cage and a lot of mouse poop. It looks like nobody has cleaned this cage in a while. There is a food bowl, and a water spout. The rats are all around their bowl eating. You see a box cutter on the ground in the far corner. ","poison", "You have entered the rat cage. They are all eating. You know the rat are close allies of the Gerbil cartel. It is best to contain this situation.", rats);
		static Rooms guineaPigCage = new Rooms ("Guinea Pig Cage","It looks like you've just entered a bad neighborhood. The guinea pig cage is barren. There is no food or water. There is a rotten smell like something died in here. ","box cutter", "You're in the guinea pig cage. Gary is pacing back and forth talking to himself and laughing. You check to see if he has a bluetooth headset and is just on a phone call… nope, hes just crazy. He seems manic. You should be careful.",gary);
	    static Rooms snakeCage = new Rooms("Snake Cage","The snake cage really hot and dry. The snakes have food and water. There is a rocky terrain underneath a heat lamp. You also notice a bat on the ground.","key", "You have entered the snake cage. The snake looks happy that you've arrived. She slither over to you making creepy hissing sound with her tounge.", Sarah);
		static Rooms checkoutCounter = new Rooms("Checkout Counter", "Other than the magic pellets, the checkout counter is empty…..","bat", "You have reached the checkout counter. You see the Magic Pellets…. \nUh-oh its Andres!!! It looks like you are going to have to fight him hand-to-hand.", andres);
		
		
		static Adventurer cheeks= new Adventurer();//creates the player
	
	public void itemAdd()//adds items into their room and into the master list
		{
		/**
		 * @author Keith, Kevin, Spencer
		 * @since 1.0
		 * <h1> Description </h1>
		 * This method adds all the items into their Rooms and then adds all item and characters into one array list to be used to check if the player can access an item
		 */
			cheeksCage.getContents().add(laserPointer);
			cheeksCage.getContents().add(invoice);
			cheeksCage.getContents().add(toothpick);
			rabbitCage.getContents().add(plasticBag);
			catCage.getContents().add(tranquilizer);
			puppyCrate.getContents().add(key);
			turtleCage.getContents().add(poison);
			//gerbilCage.getContents().add(treat);
			ratCage.getContents().add(boxCutter);
			snakeCage.getContents().add(bat);
			
			allThings.add(laserPointer);
			allThings.add(invoice);
			allThings.add(toothpick);
			allThings.add(plasticBag);
			allThings.add(tranquilizer);
			//allThings.add(treat);
			allThings.add(key);
			allThings.add(poison);
			allThings.add(boxCutter);
			allThings.add(bat);
			allThings.add(terry);
			allThings.add(jack);
			allThings.add(Sarah);
			allThings.add(andres);
			allThings.add(rats);
			allThings.add(puppy);
			allThings.add(gerbil);
			allThings.add(gary);
			allThings.add(clyde);
		}
	
	static public boolean movement(String direction)//moves the player around the map based on user input
		{
		/**
		 * @author Keith, Kevin, Spencer
		 * @since 2.0
		 * @param A string that is the direction the player wants to go or a special string that starts or ends the game
		 * @return a boolean that indicates wheter the move was successful or not
		 * <h1> Description </h1>
		 * This method control the player moving around the map using a 2d array of intergers
		 */
			if(direction.equalsIgnoreCase("start"))
			{
				for(int x=0; x<map.length;x++ )
				{
					for(int y=0; y<map[0].length; y++)
					{
						if(x==0 && y==0)
						{
							map[x][y]=0;//sets where the player is to 0
						}
						else
						{
							map[x][y]=1;//sets everywhere else to 1
						}
					}
					
				}
				System.out.println(cheeksCage.getIntro());
				System.out.println();
				System.out.println(cheeksCage.getDescription());
				System.out.println();
				return false;
			}
			if(direction.equalsIgnoreCase("end game"))
			{
				for(int x=0; x<cheeks.getInventory().size(); x++)
				{
					if(cheeks.getInventory().get(x).getName().equals("bat"))
					{
						System.out.println(checkoutCounter.getIntro());
						System.out.println(checkoutCounter.getDescription());
						return true;
					}
				}
				if(canAccess(roomLookup().getKeyItem(),roomLookup()))
				{
					System.out.println("you realize that you do not have the tools necessary to pass through this room and quickly run back to your cage where you be able to go through the defeated areas and collect items");
					map[0][0]=0;
					System.out.println();
					System.out.println(cheeksCage.getDescription());
					gameOver=false;
					return false;
				}
				
				
			}
			
			if(direction.equalsIgnoreCase("north"))
			{
				for(int x=0; x<3;x++ )
				{
					for(int y=0; y<3; y++)
					{
						if(map[x][y]==0 && x-1 != -1)
						{
							
							map[x][y]=1;
							map[x-1][y]=0;
							if(canAccess(roomLookup().getKeyItem(),roomLookup()))//checks to see if the user has the key item if they dont they are put back to the beginning
							{
								System.out.println("you realize that you do not have the tools necessary to pass through this room and quickly run back to your cage where you be able to go through the defeated areas and collect items");
								map[x-1][y]=1;
								map[0][0]=0;
								System.out.println();
								System.out.println(cheeksCage.getDescription());
								return false;
							}
							if(roomLookup().getIsBeat()==false)
							{
								System.out.println(roomLookup().getIntro());
								System.out.println();
								System.out.println(roomLookup().getAnimal().whenUsed());
								System.out.println();
							}
							
							System.out.println(roomLookup().getDescription());
							System.out.println();
							
							return true;
						}
					}
				}
				return false;
			}
			
			if(direction.equalsIgnoreCase("east"))
			{
				for(int x=0; x<3;x++ )
				{
					for(int y=0; y<3; y++)
					{
						if(map[x][y]==0 && y+1 != 3)
						{
							
							map[x][y]=1;
							map[x][y+1]=0;
							if(canAccess(roomLookup().getKeyItem(),roomLookup())==false)
							{
								System.out.println("you realize that you do not have the tools necessary to pass through this room and quickly run back to your cage where you be able to go through the defeated areas and collect items");
								map[x][y+1]=1;
								map[0][0]=0;
								System.out.println();
								System.out.println(cheeksCage.getDescription());
								return false;
							}
							if(roomLookup().getIsBeat()==false)
							{
								System.out.println(roomLookup().getIntro());
								System.out.println();
								System.out.println(roomLookup().getAnimal().whenUsed());
								System.out.println();
							}
							
							System.out.println(roomLookup().getDescription());
							System.out.println();
							
							return true;
						}
					}
				}
				System.out.println("you cant go that way");
				return false;
			}
			
			if(direction.equalsIgnoreCase("west"))
			{
				for(int x=0; x<3;x++ )
				{
					for(int y=0; y<3; y++)
					{
						if(map[x][y]==0 && y != 0)
						{
							
							map[x][y]=1;
							map[x][y-1]=0;
							if(canAccess(roomLookup().getKeyItem(),roomLookup())==false)
							{
								System.out.println("you realize that you do not have the tools necessary to pass through this room and quickly run back to your cage where you be able to go through the defeated areas and collect items");
								map[x][y-1]=1;
								map[0][0]=0;
								System.out.println();
								System.out.println(cheeksCage.getDescription());
								return false;
							}
							if(roomLookup().getIsBeat()==false)
							{
								System.out.println(roomLookup().getIntro());
								System.out.println();
								System.out.println(roomLookup().getAnimal().whenUsed());
								System.out.println();
							}
							
							System.out.println(roomLookup().getDescription());
							System.out.println();
							return true;
						}
					}
				}
				return false;
			}
			
			if(direction.equalsIgnoreCase("south"))
			{
				
				for(int x=0; x<3;x++ )
				{
					for(int y=0; y<3; y++)
					{
						if(map[x][y]==0 && x+1 !=3)
						{
							map[x][y]=1;
							map[x+1][y]=0;
							if(canAccess(roomLookup().getKeyItem(),roomLookup())==false)
							{
								System.out.println("you realize that you do not have the tools necessary to pass through this room and quickly run back to your cage where you be able to go through the defeated areas and collect items");
								map[x+1][y]=1;
								map[0][0]=0;
								System.out.println();
								System.out.println(cheeksCage.getDescription());
								return false;
							}
							if(roomLookup().getIsBeat()==false)
							{
								System.out.println(roomLookup().getIntro());
								System.out.println();
								System.out.println(roomLookup().getAnimal().whenUsed());
								System.out.println();
							}
							
							System.out.println(roomLookup().getDescription());
							System.out.println();
							return true;
						}
					}
				}
				return false;
			}
			return false;
		}
	
	public void command() //asks the player for input
	{
		/**
		 * @since 1.0
		 *  <h1> Description <h1>
		 * this is the main command method for the program
		 * this method asks the user what they would like to do and then using a switch statement sends calls the correct method
		 */
		  String in="";
          System.out.println("what would you like to do: inspect an item, take an item, use an item , drop an item, look around, or go in a cardinal direction"); 
		  in = takeString();
		  in=in.toLowerCase();
		  in=in.trim();
		  while(checkInput(in)==false)
		  {
				 System.out.println("bad input\nplease type in one of the follow \"take\",\"use\",\"drop\",\"inspect\",\"go north\",\"go east\",\"go south\", \"go west\", \"look around\" ");
				 in=takeString();
		  }
		  
		  
		  switch(in)//goes through the options
		  {
		  	case "look around":
		  		System.out.println(roomLookup().inspect());
		  		break;
		  	case "inspect":
		  		System.out.println("what item or animal");
		  		System.out.print("In Room: ");
		  		for(int x=0; x<roomLookup().getContents().size();x++)
				{
		  			
					System.out.print(roomLookup().getContents().get(x).getName()+",");
				}
		  		System.out.println();
		  		System.out.print("In Inventory: ");
				for(int x=0; x<cheeks.getInventory().size(); x++)
				{
					
					System.out.print(cheeks.getInventory().get(x).getName()+",");
					
				}
				System.out.println();
				System.out.println("Animals (besides you): "+roomLookup().getAnimal().getName());
		  		in=takeString();
		  		if(canAccess(in,roomLookup())==true)
		  		{
		  			
		  			System.out.println(itemLookup(in).inspect());
		  		}
		  		else
		  		{
		  			availableItems();
		  		}
		  		break;
		  	case "take":
		  		System.out.println("take what these are you options");
		  		for(int x=0; x<roomLookup().getContents().size(); x++)
		  		{
		  			
		  			System.out.print(roomLookup().getContents().get(x).getName()+",");
		  			
		  		}
		  		System.out.println();
		  		in=takeString();
		  		if(canAccess(in,roomLookup())==true)
		  		{
		  			cheeks.take(itemLookup(in));
		  			for(int x=0; x<roomLookup().getContents().size(); x++)
		  			{
		  				if(in.equalsIgnoreCase(roomLookup().getContents().get(x).getName()))
		  				{
		  					roomLookup().getContents().remove(x);
		  				}
		  			}
		  		}
		  		else
		  		{
		  			availableItems();
		  		}
		  		
		  		break;
		  	case "use" :
		  		System.out.println("what item");
		  		
		  		System.out.println("use what these are your options");
		  		System.out.print("In Room: ");
		  		for(int x=0; x<roomLookup().getContents().size();x++)
				{
		  			
					System.out.print(roomLookup().getContents().get(x).getName()+",");
				}
		  		System.out.println();
		  		System.out.print("In Inventory: ");
				for(int x=0; x<cheeks.getInventory().size(); x++)
				{
					
					System.out.print(cheeks.getInventory().get(x).getName()+",");
					
				}
				System.out.println();
				in=takeString();
		  		if(canAccess(in,roomLookup())==true)
		  		{
		  			gameOver=plot(itemLookup(in),roomLookup());
		  			
		  		}
		  		else
		  		{
		  			availableItems();
		  		}
		  		
		  		break;
		  	case "drop":
		  		System.out.println("drop what");
		  		in=takeString();
		  		cheeks.drop(itemLookup(in));
		  		break;
		  	case "go south":
		  		if(canMove(roomLookup(),"south")==true)
		  		{
		  			movement("south");
		  		}
		  		else
		  		{
		  			System.out.println("you cannot leave this room yet");
		  		}
		  		break;
		  	case "go north":
		  		if(canMove(roomLookup(),"north")==true)
		  		{
		  			movement("north");
		  		}
		  		else
		  		{
		  			System.out.println("you cannot leave this room yet");
		  		}
		  		break;
		  	case "go east":
		  		if(canMove(roomLookup(),"east")==true)
		  		{
		  			movement("east");
		  		}
		  		else
		  		{
		  			System.out.println("you cannot leave this room yet");
		  		}
		  		
		  		break;
		  	case "go west":
		  		if(canMove(roomLookup(),"west")==true)
		  		{
		  			movement("west");
		  		}
		  		else
		  		{
		  			System.out.println("you cannot leave this room yet");
		  		}
		  		break;
		  }
	  
	}
	
	public boolean isGameOver() 
	{
		return gameOver;
	}

	static private boolean checkInput(String in) //checks to see if the users input if usable
	{
		/**
		 * @since 1.0
		 * @param A string that the user inputed
		 * @return A boolean that indicates wheter the input was good or not
		 * <h1> Description </h1>
		 * This checks if the users puts in a valid input
		 */
		switch(in)
		{
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
		case "interact with animal":
			return true;
		}
		return false;

	
	}
	
	static public String takeString()//takes a string using a try catch
	{
		/**
		 * @since
		 * <h1> description <h1>
		 * this method attempts to take in a string from the user if there is something wrong with the input the user is asked again
		 */
		String in;
		while(true)
		{
			try
			{
				in=scan.nextLine();
			}
			catch(Exception e)
			{
				scan.next();
				System.out.println("bad input try again");
				continue;
			}
			return in;
		}
		
	}
	
	static private boolean plot(AdventureObject item, Rooms place)//outputs plot points based on what item the user is using and where they are using it
	{
		/**
		 * @since 2.0
		 * @param The object that the player wants to use
		 * @param the room that the player is in
		 * @return a boolean of that indicates whether the game is over or not
		 * <h1> Description </h1>
		 * This method outputs plot points when an item is used.
		 */
		if(place.getKeyItem().equals(item.getName()))
		{
			System.out.println(item.whenUsed());
			System.out.println();
			place.setIsBeat(true);
			if(place.getName().equalsIgnoreCase("snake cage"))
			{
				return true;
			}
			if(place.getName().equalsIgnoreCase("checkout counter"))
			{
				beatAndres=true;
			}
			return false;
		}
		else
		{
			System.out.println("this doesnt do anything");
			System.out.println();
			return false;
		}
		
	}
	
	static private boolean canMove(Rooms place, String direction)//checks to see if the user can leave the room they are in yet
	{
		/**
		 * @since 2.0
		 * @param the room that the player is in
		 * @param the direction the player wants to go
		 * @return a boolean that indicates wheter the player can move or not
		 * <h1> Description </h1>
		 * This method checks if the player can move or not in the direction they want to go. 
		 */
		if(place.getIsBeat()==true)
		{
			return true;
		}
		return false;
		
	}
	
	static private AdventureObject itemLookup(String in)//returns the item that the user wants based on their input
	{
		/**
		 * @since 2.0
		 * @param the name of the item the player wants to use
		 * @return returns the item the player wants to use
		 * <h1> Description </h1>
		 * This method returns the item that the player wants to use or take or drop 
		 */
		for(int x=0; x<allThings.size(); x++)
		{
			if(in.equals(allThings.get(x).getName()))
			{
				return allThings.get(x);
			}
		}
		return null;
		
	}
	
	static private Rooms roomLookup()//returns the room that the player is in using the 2d array
	{
		/**
		 * @since 2.0
		 * @return this method returns the room that the player is in
		 * <h1> Description </h1>
		 * This method returns the room that the player is in using a form loop to determine where they are using the 2d array
		 */
		
		for(int x=0; x<map.length; x++)
		{
			for(int y=0; y<map[0].length; y++)
			{
				if(map[x][y]==0)
				{
					if(x==0 && y==0)
					{
						
						return cheeksCage;
					}
					if(x==0 && y==1)
					{
						return rabbitCage;
					}
					if(x==0 && y==2)
					{
						return catCage;
					}
					if(x==1 && y==0)
					{
						return puppyCrate;
					}
					if(x==1 && y==1)
					{
						return turtleCage;
					}
					if(x==1 && y==2)
					{
						return gerbilCage;
					}
					if(x==2 && y==0)
					{
						return ratCage;
					}
					if(x==2 && y==1)
					{
						return guineaPigCage;
					}
					if(x==2 && y==2)
					{
						return snakeCage;
					}
				}
			}
			if(gameOver==true)
			{
				return checkoutCounter;
			}
		}
		return null;
	}

	static private boolean canAccess(String item, Rooms place)//checks to see if the player can access the item or Character that they are looking for
	{
		/**
		 * @since 2.0
		 * @param The name of the item that the player wants to interact with
		 * @param The room that the player is in
		 * @return a boolean that indicates whether the item is available or not
		 */
		
		for(int x=0; x<place.getContents().size();x++)
		{
			if(item.equals(place.getContents().get(x).getName()))
			{
				return true;
			}
		}
		for(int x=0; x<cheeks.getInventory().size();x++)
		{
			if(item.equals(cheeks.getInventory().get(x).getName()))
			{
				return true;
			}
		}
		if(place.getAnimal().getName().equals(item))
		{
			return true;
		}
		return false;
	}
	
	static private void availableItems()//shows the users what items are available to them
	{
		/**
		 * @since 2.0
		 * <h1> Description </h1> 
		 * Prints to console the items the player can access if they try to get something they cant
		 */
		System.out.println("you cannot access that item here are the item you can access");
		for(int x=0; x<roomLookup().getContents().size();x++)
		{
			System.out.println(roomLookup().getContents().get(x).getName()+" ");
		}
		for(int x=0; x<cheeks.getInventory().size(); x++)
		{
			System.out.println(cheeks.getInventory().get(x).getName()+" ");
		}
	}
	
	static public boolean isAndresBeat()
	{
		return beatAndres;
	}
	
>>>>>>> origin/master
}