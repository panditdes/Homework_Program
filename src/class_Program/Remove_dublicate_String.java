package class_Program;

public class Remove_dublicate_String {


	// Create removeDuplicates() method to remove duplicates using indexOf() method  
	public static void removeDuplicates(String str)   
	{   
		//Create an empty string   
		String newstr = new String();   

		//calculate length of the original string  
		int length = str.length();   

		// Traverse the string and check for the repeated characters   
		for (int i = 0; i < length; i++)    
		{   
			// store the character available at ith index in the string  
			char charAtPosition = str.charAt(i);   

			// check the index of the charAtPosition. If the indexOf() method returns true add it to the resuting string  
			if (newstr.indexOf(charAtPosition) < 0)   
			{   
				newstr += charAtPosition;   
			}   
		}   
		//Print string after removing duplicate characters   
		System.out.println(newstr);  
	}   

	  
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Create a string variable with default value   
		String str = "Going to home is the sweatest feeling in the world";   
		//call removeDuplicates() method for removing duplicate characters    
		removeDuplicates(str);


	}   

} 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

