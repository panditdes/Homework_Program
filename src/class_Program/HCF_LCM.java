package class_Program;

import java.util.Scanner;

public class HCF_LCM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter Two Number: ");
		
		
		int n1 = scn.nextInt();
		
		int n2 = scn.nextInt();
		
		scn.close();
		
		int x = n1;
		
		int y = n2;
		
		int hcf,lcm;
		
		
		while(n1 != n2)
		{
			if(n1>n2)
			{
				n1 = n1-n2;
			}
			
			else
			{
				n2 = n2-n1;
			}
		}
		
		hcf = n1;
		
		lcm =((x*y)/hcf);
		
		System.out.println("HCF is : "+hcf);
		
		System.out.println(" ");
		
		System.out.println("LCM is : "+lcm);
		
		
		
	}

}
