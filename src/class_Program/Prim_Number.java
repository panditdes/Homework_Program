package class_Program;

import java.util.Scanner;

public class Prim_Number {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Number:");
		int n=sc.nextInt();
		int temp=0;
		for(int i=2;i<n-1;i++)
		{
			if(n%i==0)
			{
				temp=temp+1;
			}
		}
		if(temp==0)
		{
			System.out.println("prime number");
		}
		else
		{
			System.out.println("not prime number");
		}

	}

}
