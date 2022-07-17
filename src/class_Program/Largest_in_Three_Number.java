package class_Program;

public class Largest_in_Three_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=5,b=5,c=1;

		if(a>=0&&b>=0&&c>=0) {

			if(a>=b&&a>=c)
			{
				if(a==b&&a==c)
				{
					System.out.println("a,b,c numbers are same and greater");
				}
				else if(a==b)
				{
					System.out.println("a and b is same and greater");
				}

				else
				{
					System.out.println("a is greater"+a);
				}
			}
			else if(b>=a&&b>=c)
			{
				if(b==c)
				{
					System.out.println("b,c numbers are same and greater ");
				}

				else
				{
					System.out.println("b is greater"+b);
				}

			}
			else
			{

				System.out.println("c is greater"+c);
			}
		}
		else
		{
			System.out.println("invalid number");
		}

	}

}
