package class_Program;

import java.util.Scanner;

public class ArmStrong_Number {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		int originalNumber,Reminder;
		
		double Result = 0;
		
		
		Scanner k = new Scanner(System.in);
		
		System.out.println("Enter The Number: ");
		
		int a = k.nextInt();
		
		
		originalNumber =a;
		
		while(originalNumber != 0)
		{
			Reminder =originalNumber%10;   //370%10=0,   37%10=7, 7%10=7
			
			Result=Result+Math.pow(Reminder,3); //0+0=0,0+343=343,343+27=370
			
			originalNumber = originalNumber/10;  //370/10=37,37/10=7,7/10=0
		
		}
		
	
		if (Result == a)
		{
			System.out.println("Is A ArmStrong Number");
		}
		else
		{
			System.out.println(" Is A Not ArmStrong Number");
		}
		
		
		
	}

}
