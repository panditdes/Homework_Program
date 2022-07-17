package class_Program;

import java.util.Scanner;

public class Largest_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		@SuppressWarnings("resource")
		Scanner s=new Scanner(System.in);
		System.out.print("Enter 1st Number:");
		
		int input1=s.nextInt();
		System.out.print("Enter 2nd Number:");
		int input2=s.nextInt();
		
		if(input1==input2)//55 =55
		{
			System.out.println(input1+" equal to: "+input2);// 55 equal to 55:
		}
		else if(input1>input2)
		{
			System.out.println(input1+" greater than "+input2);
		}
		else
		{
			System.out.println(input1+" less than "+input2);
		}


		
		
		
		
		
	}

}
