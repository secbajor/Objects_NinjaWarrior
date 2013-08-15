
public class main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//creates a NinjaWarrior object named player 
		NinjaWarrior player = new NinjaWarrior(10); 
		
		//we can run any of our methods on player using "player.methodNameHere
		System.out.println("Starting strength is "+player.getStr()); 
		player.setStr(14); //updates the strength to 14
		System.out.println("Strength is now "+player.getStr()); 
		
		

	}

}
