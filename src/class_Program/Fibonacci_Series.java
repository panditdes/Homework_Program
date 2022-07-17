package class_Program;

import java.util.Scanner;

public class Fibonacci_Series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			int firstNumber=100,secondNumber=1,Total;
			@SuppressWarnings("resource")
			Scanner k=new Scanner(System.in);
			System.out.print("Enter the Number:");
			int n=k.nextInt();
			for(int i=1;i<=n;i++)
			{
				System.out.print( +firstNumber+",");
				Total=firstNumber+secondNumber;
				firstNumber=secondNumber;
				secondNumber=Total;
				
		
		}

	}

}
