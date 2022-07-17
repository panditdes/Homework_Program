package class_Program;

import java.util.Scanner;

public class Even_Odd_Number {

	
	@SuppressWarnings("resource")
	public static void main(String[] args) {

	
        Scanner k = new Scanner(System.in);
		
		System.out.println("Enter The Number: ");
	
		int num = k.nextInt();
		
		if(num>=0) 
		{
			if(num % 2 ==0)
				System.out.println("Even Number:"+num);
			
			else 
				System.out.println("Odd Number:"+num);
		}
		
		else
			System.out.println("Invalid Number");
		
	
		
		
			
		
			
	}

}
