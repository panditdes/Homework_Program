package class_Program;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The No: ");
		int num=sc.nextInt();
		int fact =1;//inti=1;
		//while(i<=num)
		for(int i=1;i<=num;i++)
		{
		fact = fact*i;
		//i++;

		}
		System.out.println("factorial of="+fact);
		

		
	}

}
