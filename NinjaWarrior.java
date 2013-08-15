
public class NinjaWarrior {

	//declare all private variables (add one for each stat) 
	private int str; 
	
	/**
	 * this "constructs" an instance of our NinjaWarrior object
	 * we pass it a variable as an "argument" for each "stat" that our NinjaWarrior has
	 * so far, he only has one stat (strength) and I have chosen "int s" as the argument to represent that stat
	 * between the brackets, we set each private variable (str) equal to its corresponding argument (s) 
	 */ 
	NinjaWarrior(int s)	 
	{
		str = s; 
	}
	
	/**
	 * this is an example of a "set method" 
	 * set methods allow us to UPDATE the value of a stat
	 */
	public void setStr(int s)
	{
		str = s; 
	}
	
	/**
	 * this is an example of a "get method" 
	 * get methods allow us to access the value for a stat, which is helpful for when we want to print that stat
	 */
	public int getStr()
	{
		return str; 
	}
}
