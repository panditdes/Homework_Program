package class_Program;

import java.util.Arrays;

public class Reverse_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {10,20,12,45,67,74,90};
		System.out.println("old Array"+Arrays.toString(a));
		for(int i=0;i<((a.length)/2);i++)
		{
			int h=a[(a.length-1)-i];
			a[(a.length-1)-i]=a[i];
			a[i]=h;
			System.out.println(Arrays.toString(a));
			
		}
			
		System.out.println("new Array"+Arrays.toString(a));	

	}

}
