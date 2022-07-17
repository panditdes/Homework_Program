package class_Program;

public class Find_Laregest_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {12,34,9,1,23,15,55};
		int largestNumber=a[0];
		for(int i=1;i<a.length;i++)
		{
			if(largestNumber<a[i])
			{
				largestNumber=a[i];
			}
		}
		System.out.println("largest Number:"+largestNumber);




	}

}
