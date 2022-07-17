package class_Program;

import java.util.Scanner;

public class Pallindrom_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int temp,sum=0,r;
		@SuppressWarnings("resource")
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter The Number:");
		int n=sc.nextInt();
		
		temp=n;
		
		while(n>0) 
		{  
			r=n%10;
			sum=(sum*10)+r;
			n=n/10;
		}
		
		if(temp==sum)
			System.out.println("palindrome number");
		else
			System.out.println("not palindrome");

	}

}
