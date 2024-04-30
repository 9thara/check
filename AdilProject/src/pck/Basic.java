package pck;

public class Basic {

	//instance variable
	int id;

	//class variable
	static String country="";

	

	//User defined 
	public static void main(String args[]) {

		Basic obj=new Basic();
		obj.sum(12, 23);
		//call a method
		
		
		//sysout()
	}

	
	
	public int sum(int a, int b) {
		
		return a+b;
	}
/*
 * Abstraction
 * 
 * which will hide the implementation and expose only the relevant information is called abstraction
 * 
 * 1. Abstract class  - 0 - 100%
 * 2. interface - 100%
 * 
 */
}


/*
 * OOPS
 * 
 * class
 * object
 * Method overloading
 * inheritance  - Method overriding
 * 
 * Abstract class
 * interface
 * encapsulation
 * 
 * Exception Handling
 * Collections
 * File Hanlding
 */