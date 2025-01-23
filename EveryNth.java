/*
* Skeletal code for in-class problem 1
* CSIS225  Spring 2025
*/

import java.io.FileNotFoundException;
import java.util.*;

public class EveryNth {
    public static void main(String[] args) throws FileNotFoundException {
		int n = 0;	//number of words to skip
	    
		//Check command line argumemts
		if (args.length == 0 ) {
			System.out.println("Incorrect number of arguments");
			System.exit(1);
		}

		// grab n and check to see if its a positive number.
		try {
			n = Integer.parseInt(args[0]);
		}
		catch(NumberFormatException e){
			System.out.println("Need to specify a positive integer");
			System.exit(1);
		}
		
		// Create an input scanner from the standard input
		
		// Get the input

		// Display every nth word
			
    }
}

