package class_Program;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Java Program to illustrate how to declare, instantiate, initialize  
		//and traverse the Java array.  
		
		int a[]=new int[5];//declaration and instantiation  
		a[0]=10;//initialization  
		a[1]=20;  
		a[2]=70;  
		a[3]=40;  
		a[4]=50;  
		//traversing array  
		for(int i=0;i<a.length;i++)//length is the property of array  
		System.out.println(a[i]);
		
		System.out.println("=========================================================================");
		
		
		//Java Program to illustrate the use of declaration, instantiation   
		//and initialization of Java array in a single line 
		int b[]={33,3,4,5};//declaration, instantiation and initialization  
		//printing array  
		for(int i=0;i<b.length;i++)//length is the property of array  
		System.out.println(b[i]);  
		
		
		System.out.println("=========================================================================");
		
		
		//Java Program to print the array elements using for-each loop
		int arr[]={33,3,4,5};  
		//printing array using for-each loop  
		for(int i:arr)  
		System.out.println(i);
		
	
			
		
	}

}
