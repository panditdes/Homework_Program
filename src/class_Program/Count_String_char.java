package class_Program;

public class Count_String_char {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string="India Is My Country";
		
		int count=0;
		
		for(int i=0;i<string.length();i++)
		{
			if(string.charAt(i)!=' ')
				count++;
		}
			System.out.println("Total number of charcter in string is "+count);

	}

}
