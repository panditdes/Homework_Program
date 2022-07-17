package class_Program;

public class Smallest_Number_in_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {12,34,9,14,23,15,55};
		int smallestNumber=a[0];
		for(int i=1;i<a.length;i++)
		{
			if(smallestNumber>a[i])
			{
				smallestNumber=a[i];
			}
		}
		System.out.println("smallest Number:"+smallestNumber);

	}

}
